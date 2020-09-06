package Section14ProjectsKumandaIterable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Kumanda Programina Hosgeldiniz :");
        Scanner scanner = new Scanner(System.in);

        String islemler = "Islemler...\n" +
                "1.Kanallari Goster\n" +
                "2.Kanal Ekle\n" +
                "3.Kanal Sil\n" +
                "4.Kanal Sayisi Ogren\n" +
                "Cikis icin q ye basiniz ...";

        Kumanda kumanda = new Kumanda();
        while (true) {
            System.out.println(islemler);
            System.out.println("*************");
            System.out.print("Islemi giriniz  : ");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor ...");
                break;
            }else if(islem.equals("1")){
                kanallari_goster(kumanda);

            }else if(islem.equals("2")){
                System.out.print("eklenecek Kanal Ismi : ");
                String kanal_ismi=scanner.nextLine();
                kumanda.kanal_ekle(kanal_ismi);
            }else if(islem.equals("3")){
                System.out.print("Silinecek Kanal Ismi : ");
               String kanal_ismi=scanner.nextLine();
               kumanda.kanal_sil(kanal_ismi);

            }else if(islem.equals("4")){
                kumanda.kanal_sayisi();
;
            }else{
                System.out.println("Gecersiz bir islem ...");
            }

        }
    }

    public static void kanallari_goster(Kumanda kumanda){
        if(kumanda.kanal_sayisi()==0){
            System.out.println("Su anda hicbir kanal bulunmuyor..");
        }else{
            for (String s:kumanda) {
                System.out.println(s);
            }
        }
    }
}