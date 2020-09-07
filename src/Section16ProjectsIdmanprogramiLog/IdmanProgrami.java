package Section16ProjectsIdmanprogramiLog;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IdmanProgrami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Idam Programina Hosgeldiniz ....");

        String idmanlar="Gecerli Hareketler ...\n" +
                         "Burpee\n"+
                         "Pushup\n"+
                         "Situp\n"+
                         "Squat\n";
        System.out.println("*****************************");
        System.out.println(idmanlar);
        System.out.println("*****************************");
        System.out.println("Bir idman olusturun.......");

        System.out.print("Burpee Sayisi :");
        int burpee=scanner.nextInt();
        System.out.print("Pushup Sayisi :");
        int pushup=scanner.nextInt();
        System.out.print("Situp Sayisi :");
        int situp=scanner.nextInt();
        System.out.print("Squat Sayisi :");
        int squat=scanner.nextInt();
        scanner.nextLine();


        Idman idman=new Idman(burpee,pushup,situp,squat);
        System.out.println("Idmaniniz basliyor...");

        int i=1;
        try(FileWriter writer=new FileWriter("log.txt") ) {

            writer.write("Idman Programi : \n");
            writer.write("Burpee Sayisi : "+idman.getBurpee_sayisi()+"\n");
            writer.write("Pushup Sayisi : "+idman.getPushup_sayisi()+"\n");
            writer.write("Situp Sayisi : "+idman.getSitup_sayisi()+"\n");
            writer.write("Squat Sayisi : "+idman.getSquat_sayisi()+"\n");



            while (idman.idmanBittimi() == false) {
                System.out.print("Hareket turu (Burpee,Pushup,Situp,Squat)");
                String tur = scanner.nextLine();
                System.out.print("Bu hareketten kac tane yapacaksiniz : ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                idman.hareketYap(tur, sayi);

                writer.write(i+".islem--------> Hareket : "+tur+ " Sayi : "+sayi+ " \n");
                i++;
            }
            System.out.println("Idmaniniz basari ile bitti ...");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
