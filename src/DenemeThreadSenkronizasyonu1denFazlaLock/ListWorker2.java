package DenemeThreadSenkronizasyonu1denFazlaLock;

import java.util.ArrayList;
import java.util.Random;

public class ListWorker2 {
    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    private Object lock1=new Object();   // birden fazla lock kullanmak zamani yariya indirir....
    private Object lock2=new Object();


    public void list1Degerekle() {

        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));

        }

    }
        public void list2Degerekle() {
            synchronized (lock2) {

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list2.add(random.nextInt(100));

            }
        }

        public void degerAta(){

            for (int i = 0; i <1000 ; i++) {
                list1Degerekle();
                list2Degerekle();
            }
    }
    public void calstir(){
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });
        long baslangic =System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("List 1 : "+list1.size()+" List 2 : "+list2.size());
        long bitis=System.currentTimeMillis();
        System.out.println("Gecen sure : "+(bitis-baslangic));
    }
    }
