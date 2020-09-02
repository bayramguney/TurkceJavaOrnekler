package Section8ProjectsCalisanlar;

import java.util.Scanner;

public class CalisanlarProjesi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Calisanlar Programina Hosgeldiniz  ");
        String islemler="Islemler\n"+
                        "1.Yazilmci Islemleri\n"+
                        "Yonetici Islemleri\n"+
                         "Cikic icin q ye basiniz";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");

        while(true){
            System.out.println("Islemi seciniz : ");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor  ...");
                break;
            }else if(islem.equals("1")){
                Yazilimci yazilimci=new Yazilimci("mustafa","Sahin",564,"Java,C");
               String yazilimci_islemleri="1.Format At\n"+
                                          "2.Bilgileri Goster\n"+
                                          "Cikis icin q ye basiniz";
                System.out.println(yazilimci_islemleri);
                while(true){
                    System.out.print("Islemi seciniz : ");
                    String y_islem=scanner.nextLine();
                    if(y_islem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor...");
                        break;
                    }else if(y_islem.equals("1")){
                        System.out.print("Isletim sistemi : ");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }else if(y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }else{
                        System.out.println("Gecersiz yazilimci islemi .....");
                    }

                }

            }else if(islem.equals("2")) {
                Yonetici yonetici=new Yonetici("Serhat","Say",123,10);
                String yonetici_islemleri="1.Zam Yap\n"+
                                           "2.Bilgileri Goster\n"+
                                           "Cikis icin q ye basiniz";
                System.out.println(yonetici_islemleri);
                while(true){
                    System.out.println("Islem seciniz : ");
                    String y_islem=scanner.nextLine();
                    if(y_islem.equals("q")){
                        System.out.println("Yonetici islemlerinden cikiliyor...");
                        break;
                    }else if(y_islem.equals("1")){
                        System.out.print("Yoneticinin ne kadar zam almasini istiyorsunuz  ");
                        int zam_miktari=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }else if(y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }else{
                        System.out.println("Gecersiz yonetim islemi .....");
                    }

                }

            }else{
                System.out.println("Gecersiz islem....");
            }
        }

    }
}
