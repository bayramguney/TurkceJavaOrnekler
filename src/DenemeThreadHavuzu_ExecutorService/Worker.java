package DenemeThreadHavuzu_ExecutorService;

public class Worker implements Runnable{
   private String isim;
   private  int taskId;

    public Worker(String isim, int taskId) {
        this.isim = isim;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Worker : "+isim+" "+taskId+". ise basladi...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker : "+isim+" "+taskId+". isi bitirdi..");

    }
}
