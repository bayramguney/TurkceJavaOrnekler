package Thread.DenemeThreadBirdenCokAyniAndaCalistirma;

import java.util.concurrent.Semaphore;

public class SemaphoreOrnegi {
    private Semaphore semaphore=new Semaphore(3); // 3 tane threade izin verdik

    public void threadFonksiyonu(int id){
        try {
            semaphore.acquire();   // thread gelir buna bakar eger degri sifir ise bekler.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Basliyor :  ID  :"+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Cikiyor .... ID  :"+id);
        semaphore.release();
    }

}
