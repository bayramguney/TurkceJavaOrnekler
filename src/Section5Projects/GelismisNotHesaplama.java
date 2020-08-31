package Section5Projects;

import java.util.Scanner;

public class GelismisNotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" vize1   :");
        int vize1 = scanner.nextInt();
        System.out.print(" vize2   :");
        int vize2 = scanner.nextInt();
        System.out.print(" final   :");
        int finalnot = scanner.nextInt();
        System.out.print("okul ortalamaniz   : ");
        double ortalama = scanner.nextDouble();

        double toplamnot = (vize1 * 0.3) + (vize2 * 0.3) + (finalnot * 0.4);


        if (toplamnot >= 90) {
            System.out.println("AA");
        } else if (toplamnot >= 90) {
            System.out.println("AA");
        } else if (toplamnot >= 85) {
            System.out.println("BA");
        } else if (toplamnot >= 80) {
            System.out.println("BB");
        } else if (toplamnot >= 75) {
            System.out.println("CB");
        } else if (toplamnot >= 70) {
            System.out.println("CC");
        } else if (toplamnot >= 65) {
            System.out.println("DC");
        } else if (toplamnot >= 60) {
            System.out.println("DD");
            if(ortalama<2.5){
                System.out.println("DD aldiniz ve ortalamaniz dusuk.tekrar dersi alabilirsiniz");
            }
        } else if (toplamnot >= 55) {
            System.out.println("FD");
        } else {
            System.out.println("FF");
        }
    }
}