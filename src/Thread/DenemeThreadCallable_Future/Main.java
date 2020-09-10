package Thread.DenemeThreadCallable_Future;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(1);
        executor.submit(new Runnable() {
            @Override
            public void run() {
                Random random=new Random();
                System.out.println("Thread calisiyor ...");
                int sure=random.nextInt(1000)+2000;
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread cikiyor ...");
            }
        });
        executor.shutdown();


    }
}
