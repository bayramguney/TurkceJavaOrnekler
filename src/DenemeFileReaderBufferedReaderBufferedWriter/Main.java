package DenemeFileReaderBufferedReaderBufferedWriter;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//BufferedReader fileReader den daha hizlidir  Buyuk dosyalar icin uygundur...

      //  try (Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {
            try (Scanner scanner = new Scanner(new BufferedReader (new FileReader("ogrenciler.txt")))){

                while (scanner.hasNextLine()) {
                    String ogrenci_bilgisi = scanner.nextLine();
                    String[] array = ogrenci_bilgisi.split(",");
                    if (array[1].equals("Bilgisayar Muhendisligi")) {
                        System.out.println("Ogrenci Bilgisi : " + ogrenci_bilgisi);
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("dosya bulunamadi ...");
            } catch (IOException e) {
                System.out.println("dosya acilirken bir hata olustu...");
            }

            System.out.println("*********************************");

            try(BufferedWriter writer=new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
                 writer.write("Ali Ozan,Insaat Muhendisligi\n");
            }catch(IOException e){
                System.out.println("Dosya acilirken hata olustu ...");
            }

    }
}