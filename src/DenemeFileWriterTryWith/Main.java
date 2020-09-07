package DenemeFileWriterTryWith;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter writer =new FileWriter("duller.txt"); ) {
            Scanner scanner=new Scanner(System.in);
           String dil;
            while(true){
                System.out.print("bir dil giriniz...  ");
                dil=scanner.nextLine();

                if(dil.equals("-1")){
                    System.out.println("Programdan cikiliyor...");
                    System.out.println("dosyayi kontrol ediniz....");

                    break;
                }
                writer.write(dil+"\n");

            }

        } catch (IOException e) {
            System.out.println("Dosya acilirken hata olustu...");
        }
    }
}
