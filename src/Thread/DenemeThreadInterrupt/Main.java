package Thread.DenemeThreadInterrupt;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor ...");
                for (int i = 1; i <=10 ; i++) {
                    System.out.println("Thread yaziyor : "+i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("Uykumun "+i+ " saniyesindeyim ");
                    } catch (InterruptedException e) {
                        System.out.println("Uykum bolundu....");
                    }
                }
            }
        });
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}