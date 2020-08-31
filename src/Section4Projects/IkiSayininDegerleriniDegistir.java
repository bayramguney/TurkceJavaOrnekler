package Section4Projects;

import java.util.Scanner;

public class IkiSayininDegerleriniDegistir {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;

        System.out.print("Birinci sayi :  ");
        birinci_sayi=scan.nextInt();

        System.out.print("Ikinci sayi :  ");
        ikinci_sayi=scan.nextInt();
        System.out.println("Degistirilmeden once  "+ "birinci sayi  ="+birinci_sayi+  "  ikinci sayi :"+ikinci_sayi);

        int gecici=birinci_sayi;
        birinci_sayi=ikinci_sayi;
        ikinci_sayi=gecici;

        System.out.println("Degistirildikten sonra  "+ "birinci sayi  ="+birinci_sayi+  "  ikinci sayi :"+ikinci_sayi);


    }
}
