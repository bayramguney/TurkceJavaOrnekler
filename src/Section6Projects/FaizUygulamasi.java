package Section6Projects;

import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamiza Hos Geldiniz.Faiz Orani % 6 ' dir");
        int anapara,vade;
        System.out.print("Anapara miktarini giriniz : ");
        anapara=scanner.nextInt();
        System.out.print("Kac yil vade istiyorsunuz ? ");
        vade=scanner.nextInt();

        double toplam =anapara;
        double faiz_orani=0.06;

        for(int i=1;i<=vade;i++){
            toplam+=faiz_orani*toplam;
            System.out.println(i+" yilin sonunda toplam para  "+(int)toplam);

        }

    }
}
