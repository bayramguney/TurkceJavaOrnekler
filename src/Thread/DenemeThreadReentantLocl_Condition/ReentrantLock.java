package Thread.DenemeThreadReentantLocl_Condition;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ReentrantLock  {
    private int say = 0;
    private Lock lock = (Lock) new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void artir() {
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }

    public void thread1Fonksiyonu() {
        lock.lock();
        System.out.println("Thread1 Uyandirilmayi bekliyor...");
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread1 uyandirildi .Islemine devam ediyor...");
        artir();

        lock.unlock();


    }

    public void thread2Fonksiyonu() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);


        lock.lock();
        System.out.println("Thread1 calisiyor....");

        artir();
        System.out.println("Devam etmek icin  bir tusa basiniz...");
        scanner.nextLine();
        condition.signal();
        System.out.println("Thread1 i uyandirdim.Ben gidiyorum...");
        lock.unlock();


    }

    public void threadOver() {
        System.out.println("Say degiskeninin degeri  : " + say);

    }
}
