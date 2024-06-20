package javadb;

import java.sql.*;

public class DatabaseConnection {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://127.0.0.1/penjualan";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        addData();
        displayData();
    }

    public static void addData() {
        String productCode = "brg17";
        String productName = "Mie Goreng";
        String unit = "Bungkus";
        int stock = 40;
        int minStock = 1;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            String query = "INSERT INTO barang (kd_brg, nm_brg, satuan, stok_brg, stok_min) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, productCode);
            preparedStatement.setString(2, productName);
            preparedStatement.setString(3, unit);
            preparedStatement.setInt(4, stock);
            preparedStatement.setInt(5, minStock);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayData() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM barang");

            int count = 1;
            while (resultSet.next()) {
                System.out.println("Record #" + count);
                System.out.println("Product Code: " + resultSet.getString("kd_brg"));
                System.out.println("Product Name: " + resultSet.getString("nm_brg"));
                System.out.println("Unit: " + resultSet.getString("satuan"));
                System.out.println("Stock: " + resultSet.getInt("stok_brg"));
                System.out.println("Minimum Stock: " + resultSet.getInt("stok_min"));
                count++;
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
