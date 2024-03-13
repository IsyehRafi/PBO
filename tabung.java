import java.util.Scanner;

public class tabung {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       double diameter, tinggi, volume;
       double jariJari;
       
       System.out.print("Masukkan diameter tabung: ");
       diameter = scanner.nextDouble();
       
       System.out.print("Masukkan tinggi tabung: ");
       tinggi = scanner.nextDouble();
       
       jariJari = diameter / 2;
       
       volume = 3.14 * jariJari * jariJari * tinggi;
       
       System.out.println("Volume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah " + volume);
   }
}
