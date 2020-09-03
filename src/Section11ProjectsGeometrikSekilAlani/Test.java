package Section11ProjectsGeometrikSekilAlani;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = "Islemler...\n" +
                "1.Kare Alan Kesapla...\n" +
                "2.Ucgen Alan Hesapla...\n" +
                "3.Daire Alan Hesapla...\n" +
                "Cikis icin q ye basiniz...";

        while (true) {
            System.out.println("********************************");
            System.out.println(islemler);
            System.out.println("********************************");
            System.out.println("Hangi seklin alanini hesaplamak istiyorsunuz...");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;

            if (sekil_turu.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else if (sekil_turu.equals("1")) {
                System.out.print("Karenin kenari : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("Kare1", kenar);
                sekil.alan_hesapla();

            } else if (sekil_turu.equals("2")) {
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Ucgen", kenar1, kenar2, kenar3);
                sekil.alan_hesapla();

            } else if (sekil_turu.equals("3")) {
                System.out.println("Dairenin yaricapi : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire1", yaricap);
                sekil.alan_hesapla();
            }else {
                System.out.println(" Gecersiz bir islem ...");
            }

        }


    }


}
