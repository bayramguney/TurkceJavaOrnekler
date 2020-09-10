package Thread.DenemeThreadHavuzu_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main1 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(2);  //en fazla iki thread calisir burada
        for (int i = 1; i <=5 ; i++) {
            executor.submit(new Worker(String.valueOf(i),i));

        }
        executor.shutdown();  // aksi takdirde main metodu sonlanmaz...
        System.out.println("Butun isler teslim edildi ...");
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);// Buyuk programlarda biz diyoruz ki en fazla bir gunde bitsin bitiyruz.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Butun isler bitti...");

    }
}
