package Section16ProjectsNotHesaplama;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalnot) {
        String cikti = "";
        double toplamnot = (vize1 * 0.03 + vize2 * 0.03 + finalnot);

        if (toplamnot >= 90) {
            cikti = isim + " Bu dersden AA aldi";
        } else if (toplamnot >= 85) {
            cikti = isim + " Bu dersden BA aldi";
        } else if (toplamnot >= 80) {
            cikti = isim + " Bu dersden BB aldi";
        } else if (toplamnot >= 75) {
            cikti = isim + " Bu dersden CB aldi";
        } else if (toplamnot >= 70) {
            cikti = isim + " Bu dersden CC aldi";
        } else if (toplamnot >= 65) {
            cikti = isim + " Bu dersden DC aldi";
        } else if (toplamnot >= 60) {
            cikti = isim + " Bu dersden DD aldi";
        } else if (toplamnot >= 55) {
            cikti = isim + " Bu dersden FD aldi";
        } else {
            cikti = isim + " Bu dersden FF aldi";
        }
        return cikti;

    }

    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(new FileReader("data.txt"));
             FileWriter writer = new FileWriter("harfnotlari.txt")) {
            while (scanner.hasNextLine()) {
                String ogrenciBilgileri = scanner.nextLine();
                String[] ogrenci_array = ogrenciBilgileri.split(",");
                int vize1 = Integer.valueOf(ogrenci_array[1]);
                int vize2 = Integer.valueOf(ogrenci_array[2]);
                int finalnot = Integer.valueOf(ogrenci_array[3]);


                String cikti = harfNotuHesapla(ogrenci_array[0], vize1, vize2, finalnot);
                writer.write(cikti + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}