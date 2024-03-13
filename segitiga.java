import java.util.Scanner;

public class segitiga {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        
        int alas;
        int tinggi;
        double luas;

        System.out.print("Masukkan Alas segitiga : "); 
        alas=scn.nextInt();

        System.out.print("Masukkan Tinggi segitiga : "); 
        tinggi=scn.nextInt();
        
        luas = 0.5*alas*tinggi;
        
        // Menampilkan Hasil Input
        System.out.println("Jadi luas segitiga siku siku dengan alas " + alas + " dan tinggi "+tinggi+" adalah "+luas);   

    }
    
}