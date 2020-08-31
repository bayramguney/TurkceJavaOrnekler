package Section6Projects;

import java.util.Scanner;

public class DongulerleATM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bakiye=1000;
        String islemler="1.islem : Bakiye Ogrenme\n"+
                        "2.islem : Para Cekme\n"+
                        "3.islem : Para Yatirma\n"+
                        "Cikis icin q ye basiniz";
        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("***************************************");
        while(true){
            System.out.print("islemi seciniz : ");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("programdan cikiliyor....");
                break;
            }else if(islem.equals("1")){
                System.out.println("Bakiyeniz : "+bakiye);

            }else if(islem.equals("2")){
                System.out.print("cekmek istediginiz tutar : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                if(bakiye<tutar){
                    System.out.println("yeterli bakiye yok.Bakiye : "+bakiye);
                }else{
                    bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz : "+bakiye);
                }

            }else if(islem.equals("3")){
                System.out.print("Yatirmak istediginiz tutar : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz : "+bakiye);


            }else {
                System.out.println("gecersiz islem...........");
            }
        }

    }
}
