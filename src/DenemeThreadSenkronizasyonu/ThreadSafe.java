package DenemeThreadSenkronizasyonu;

public class ThreadSafe {
    private int count=0;

    public synchronized void artir(){   // sync olmazsa thread1 ile thread2 birbirlerini beklemez .
        count++;
    }

    public void threadleriCalistir(){

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5000 ; i++) {
                    artir();
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5000 ; i++) {
                    artir();
                }

            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();     // bu metod main e once ben isimi bitireyim sen sonra devam et der.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count Degiskeni "+count);

    }




    public static void main(String[] args) {
        ThreadSafe threadSafe=new ThreadSafe();
        threadSafe.threadleriCalistir();

    }
}
