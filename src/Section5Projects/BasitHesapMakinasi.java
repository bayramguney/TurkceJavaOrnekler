package Section5Projects;

import java.util.Scanner;

public class BasitHesapMakinasi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("*************************************");
        String islemler=" 1. Toplama\n"+
                        " 2. Cikarma\n"+
                        " 3. Carpma\n"+
                        " 4. Bolme\n";
        System.out.println(islemler);
        System.out.println("*************************************");

        System.out.print("islemi seciniz  ");
        int islem=scanner.nextInt();

        int a,b;

        switch (islem){
            case 1:
                System.out.println("birinci sayi");
                a=scanner.nextInt();
                System.out.println("ikinci sayi");
                b=scanner.nextInt();
                System.out.println("girilen degerlerin toplami  : "+a+b);
                break;
            case 2:
                System.out.println("birinci sayi");
                a=scanner.nextInt();
                System.out.println("ikinci sayi");
                b=scanner.nextInt();
                System.out.println("girilen degerlerin farki  : "+(a-b));
                break;
                case 3:
                System.out.println("birinci sayi");
                a=scanner.nextInt();
                System.out.println("ikinci sayi");
                b=scanner.nextInt();
                System.out.println("girilen degerlerin carpimiu  : "+a*b);
                break;
            case 4:
                System.out.println("birinci sayi");
                a=scanner.nextInt();
                System.out.println("ikinci sayi");
                b=scanner.nextInt();
                System.out.println("girilen degerlerin toplami  : "+(double)a/b);
                break;
            default:
                System.out.println("gecersiz islem    ");
                break;
        }

    }
}
