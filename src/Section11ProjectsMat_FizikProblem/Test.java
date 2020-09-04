package Section11ProjectsMat_FizikProblem;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik ve Fizik Problemleri Programina Hogeldiniz ..");
        String islemler = "Islemler...\n" +
                "1.Daire alani Hesaplama...\n" +
                "2.Ucgen Cevresi Hesaplam...\n" +
                "3.Iki Vektorun Ic Carpimini Hesaplama...\n" +
                "Cikis icin q ye basiniz..";

        while (true) {
            System.out.println("*************************");
            System.out.println(islemler);
            System.out.println("*************************");
            System.out.print("Islemi Seciniz...  ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Dairenin yaricapi : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);

            } else if (islem.equals("2")) {
                System.out.print("Kenar1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucegencevresi(kenar1, kenar2, kenar3);
            } else if (islem.equals("3")) {
                Vec vec1 = new Vec("Vektor1");
                Vec vec2 = new Vec("Vector2");
                Problem.Fizik.icCarpim(vec1,vec2);

            } else {
                System.out.println("Gecersiz Islem...");
            }
        }

    }
}
