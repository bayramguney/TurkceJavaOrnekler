package Section6Projects;

import java.util.Scanner;

public class KullaniciGirisProgrami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;
        String sys_kullanici_adi = "mustafa";
        String sys_parola = "123456";

        System.out.println("***********************************");
        System.out.println("Kullanici Girisine Hosgeldiniz  : ");
        System.out.println("***********************************");

        while (true) {
            System.out.println("Kullanici adi : ");
            String kullanici = scanner.nextLine();
            System.out.println("Parola");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hosgeldiniz ...." + kullanici);
                break;
            } else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Parolaniz yanlis");
                giris_hakki -= 1;
                System.out.println("giris hakki "+giris_hakki);
            } else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("kullanici adiniz yanlis : " + kullanici);
                giris_hakki -= 1;
                System.out.println("giris hakki "+giris_hakki);
            } else {
                System.out.println("kullanici adiniz ve parolaniz yanlis  : " + kullanici + "  " + parola);
                giris_hakki -= 1;
                System.out.println("giris hakki "+giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("giris hakkiniz bitti.Tekrar bekleriz");
                break;
            }


        }

    }
}