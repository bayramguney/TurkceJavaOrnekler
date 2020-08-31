package Section6Projects;

import java.util.Scanner;

public class ArmstrongSayisiBulma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayiyi giriniz : ");
        int sayi=scanner.nextInt();
        System.out.println("Basamak sayisini giriniz : ");
        int basamak_sayisi=scanner.nextInt();

        int gecici_sayi=sayi;
        int toplam=0;

        do{
            int basamak_degeri=gecici_sayi%10;
            gecici_sayi/=10;
            toplam+=Math.pow(basamak_degeri,basamak_sayisi);

        }while(gecici_sayi>0);

        if (toplam==sayi){
            System.out.println("Bu sayi armstrong tur");
        }else{
            System.out.println("Bu sayi armstrong degildir");
        }
    }
}
