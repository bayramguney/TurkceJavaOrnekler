package Section10ProjectsSarkicilar;

import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar=new Sarkicilar();
    private static Scanner scanner=new Scanner(System.in);

public static void islemleri_bastir(){
    System.out.println("***********************************");
    System.out.println("\t 0-Islemleri Goruntule");
    System.out.println("\t 1-Sarkicilari Goruntule");
    System.out.println("\t 2-Sarkici Ekle");
    System.out.println("\t 3-Sarkici Guncelle");
    System.out.println("\t 4-Sarkici sil");
    System.out.println("\t 5-Sarkici ara");
    System.out.println("\t 6-Uygulamadan cik");
    System.out.println("***********************************");

}
public  static void sarkicilari_goruntule(){
    sarkicilar.sarkicilari_yazdir();
}
public static void sarkici_ekle(){
    System.out.print("Eklemek istediginiz sarkicinin ismini giriniz ..");
    String isim=scanner.nextLine();
    sarkicilar.sarkici_ekle(isim);
}
public  static void sarkici_guncelle(){
    System.out.print("Guncellemek istediginiz pozisyon( 1,2,3 ) ");
    int pozisyon=scanner.nextInt();
    scanner.nextLine();
    System.out.print("Guncellemek istediginiz ismi giriniz.. ");
    String yeni_isim=scanner.nextLine();
    sarkicilar.sarkici_guncelle(yeni_isim,pozisyon-1);
}
public static void sarkici_sil(){
    System.out.print("Silmek istediginiz pozisyon (1,2,3 ) ");
    int pozisyon=scanner.nextInt();
    sarkicilar.sarkici_sil(pozisyon-1);
}
public static  void sarkici_ara(){
    System.out.print("Aramak istediginiz sarkicinin ismini giriniz.. ");
    String isim=scanner.nextLine();
    sarkicilar.sarkici_ara(isim);
}


    public static void main(String[] args) {
        System.out.println("\t Sarkici uygulamasina hosgeldiniz...");
        islemleri_bastir();
        boolean cikis=false;
        int islem;
        while(!cikis){
            System.out.print("Bir islem seciniz...");
            islem=scanner.nextInt();
            scanner.nextLine();
            switch (islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkicilari_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4 :
                    sarkici_sil();
                    break;
                case 5 :
                    sarkici_ara();
                    break;
                case 6 :
                    cikis=true;
                    System.out.println("Uygulamadan cikiliyor ...");
                    break;

            }
        }

    }
}
