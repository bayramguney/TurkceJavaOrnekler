package DenemeThreadOlusturma3;

public class Main {
    public static void main(String[] args) {

        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Yaziyor : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        printer1.start();
        System.out.println("Main thread calisiyor...");
    }
}
