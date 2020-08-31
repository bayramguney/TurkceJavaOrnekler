package Section4Projects;

import java.util.Scanner;

public class BedenKitleIndeksi {
    public static void main(String[] args) {


        // Beden Kitle Indeksi = Kilo/(Boy(m) *Boy(m))
        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz:");
        int kilo=scan.nextInt();
        System.out.print("Boyunuzu giriniz : (Ornek :1.72  )  ");
        double boy=scan.nextDouble();

        double bki=kilo/(boy* boy);
        System.out.println("Beden Kitle Indeksi : "+bki);

    }
}