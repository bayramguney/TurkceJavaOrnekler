package DenemeThreadOlusturma2;

public class Printer implements Runnable {
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim+" Calisiyor...");
        for (int i = 0; i <10 ; i++) {
            System.out.println(isim+" Yaziyor...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye ugradi ");
            }

        }
        System.out.println(isim+" Isini bitirdi....");
    }
}