package Thread.DenemeThreadOlusturma3;   // tek kullanimlik thread cunku bir referansa atanmadi

public class Main2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
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
        }).start();
    }
}
