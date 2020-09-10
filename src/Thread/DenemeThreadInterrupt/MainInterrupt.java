package Thread.DenemeThreadInterrupt;

import java.util.LinkedList;
import java.util.List;

public class MainInterrupt {

    public static void main(String[] args) {
List<Integer> list=new LinkedList<>();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread calisiyor ...");
                for (int i = 0; i <1000000000 ; i++) {
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Kesintiye ugradi ...");
                        return;
                }
                    list.add(i);
                System.out.println("Thread kesintiye ugramadan isini bitirdi...");
                }
            }
        });
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}