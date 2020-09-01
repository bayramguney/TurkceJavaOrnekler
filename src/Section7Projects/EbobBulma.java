package Section7Projects;

import java.util.Scanner;

public class EbobBulma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("birinci sayisi giriniz  ");
        int sayi1=scanner.nextInt();
        System.out.print("ikinci sayisi giriniz  ");
        int sayi2=scanner.nextInt();
        System.out.println("ebobBulma(sayi1,sayi2) = " + ebobBulma(sayi1, sayi2));

    }


    public static int ebobBulma(int sayi1, int sayi2) {
        int ebob = 1;
        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }
}