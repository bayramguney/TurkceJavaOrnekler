package Section14ProjectsPideQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan pidesi uygulamasi :  *********");
        Random random=new Random();

        Queue pide_kuyrugu=new LinkedList();
        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Ayse");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("Ezgi");
        pide_kuyrugu.offer("Gizem");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Oguz");
        pide_kuyrugu.offer("Azer");

        int pide_sayisi=1+random.nextInt(10);
        System.out.println("Pideler cikiyor ...");
        System.out.println("Cikan Pide Sayisi : "+pide_sayisi);
        Thread.sleep(3000);

        while(pide_sayisi!=0){
            System.out.println(pide_kuyrugu.poll()+" pideyi aldi");
            pide_sayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide Kalmadi ...:(");
    }
}
