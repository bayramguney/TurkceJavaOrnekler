package Thread.DenemeThreadWait_Notify;

import java.util.Scanner;

public class WaitNotify {
    private Object lock =new Object();

    public void thread1Fonksiyonu() {
        synchronized (lock) {
            System.out.println("Thread1 calisiyor ...");
            System.out.println("Thread1 thread2 nin kendisini uyandirmasini bekliyor..");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread1 uyandi.Devam ediyor...");
        }
    }
        public void thread2Fonksiyonu () {
            Scanner scanner=new Scanner(System.in);
            try {
                Thread.sleep(2000);    // thread 1 once baslasin diye beklettik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock){
                System.out.println("Thread2 calisiyor...");
                System.out.println("Devam etmek icin bir tusa basiniz...");
                scanner.nextLine();
                lock.notify();  // benim isim ben sen calisabilrsin diyoruz
                System.out.println("Uyandirdim abi.Ben gidiyorum ama 2 saniye bekle ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
