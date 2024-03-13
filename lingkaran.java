import java.util.Scanner;

public class lingkaran {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        
        int diameter;
        double keliling;

        System.out.print("Masukkan Diameter lingkaran : "); 
        diameter=scn.nextInt();
        
        keliling = 3.14*diameter;
        
        // Menampilkan Hasil Input
        System.out.println("Jadi keliling lingkaran dengan diameter " + diameter + " adalah "+keliling);

    }
    
} 
    
