package Section16ProjectsMp3Kopyalama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik=new ArrayList<>();

    public static void dosyaOku(){
        try {
            FileInputStream in=new FileInputStream("dog-barking.mp3");
            int oku;
            while((oku=in.read())!=-1){
                icerik.add(oku);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void kopyala(String dosya_ismi) {

        try {
            FileOutputStream out = new FileOutputStream(dosya_ismi);
            for (int deger : icerik) {
                out.write(deger);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
    public static void main(String[] args) {

        dosyaOku();
        kopyala("dog2.mp3");



    }
}
