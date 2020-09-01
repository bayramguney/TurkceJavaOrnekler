package Section7Projects;

import java.util.Scanner;

public class GelismisHesapMakinasi {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islemler = "1.Toplama islemi\n " +
                "2.Cikarma islemi\n " +
                "3.Carpma islemi\n " +
                "4.Toplama islemi\n " +
                "cikis icin q ye basiniz ";
        System.out.println("**************************************");
        System.out.println(" Lutfen bir islem seciniz : ");
        System.out.println("**************************************");

        while (true) {
            System.out.println("Islemi seciniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println(("Programdan cikiliyor...."));
                break;
            } else if (islem.equals("1")) {
                System.out.println("Kac deger gireceksiniz  :  2  veya 3 olabilir ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.println(" a: ");
                    int a = scanner.nextInt();
                    System.out.println(" b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin toplami  : " + toplama(a, b));


                } else if (kacsayi == 3) {
                    System.out.println(" a: ");
                    int a = scanner.nextInt();
                    System.out.println(" b: ");
                    int b = scanner.nextInt();
                    System.out.println(" c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin toplami  : " + toplama(a, b, c));
                } else {
                    System.out.println("Bunun icin metod bulunmuyor....");
                }
            } else if (islem.equals("2")) {
                System.out.println(" a: ");
                int a = scanner.nextInt();
                System.out.println(" b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayilarin farki  : " + cikarma(a, b));

            } else if (islem.equals("3")) {
                System.out.println("Kac deger gireceksiniz  :  2  veya 3 olabilir ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.println(" a: ");
                    int a = scanner.nextInt();
                    System.out.println(" b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin carpimi  : " + carpma(a, b));


                } else if (kacsayi == 3) {
                    System.out.println(" a: ");
                    int a = scanner.nextInt();
                    System.out.println(" b: ");
                    int b = scanner.nextInt();
                    System.out.println(" c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin carpimi  : " + carpma(a, b, c));
                } else {
                    System.out.println("Bunun icin metod bulunmuyor....");
                }

            } else if (islem.equals("4")) {
                System.out.println(" a: ");
                int a = scanner.nextInt();
                System.out.println(" b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayilarin bolumu  : " + bolme(a, b));
            } else {
                System.out.println("gecersiz islem ......");
            }
        }

    }
            public static int cikarma ( int a, int b){
                return (a - b);
            }
            public static double bolme ( int a, int b){
                return ((double) a / b);
            }

            public static int toplama ( int a, int b){
                return a + b;
            }
            public static int toplama ( int a, int b, int c){
                return a + b + c;
            }

            public static int carpma ( int a, int b){
                return a * b;
            }
            public static int carpma ( int a, int b, int c){
                return a * b * c;
            }
        }