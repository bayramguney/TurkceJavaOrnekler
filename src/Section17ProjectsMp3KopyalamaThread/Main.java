package Section17ProjectsMp3KopyalamaThread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<>();

    public static void dosyaOku() {
        try {
            FileInputStream in = new FileInputStream("dog-barking.mp3");
            int oku;
            while ((oku = in.read()) != -1) {
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
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("dog2.mp3");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("dog3.mp3");
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("dog4.mp3");
            }
        });
        long baslangic = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long bitis = System.currentTimeMillis();
        System.out.println(" Uc dosyanin kopyalanamasi su kadar surdu : " + (bitis - baslangic) + " milisaniye surdu");


    }
}
