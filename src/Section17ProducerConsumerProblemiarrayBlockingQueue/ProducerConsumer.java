package Section17ProducerConsumerProblemiarrayBlockingQueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    Random random =new Random();
    BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10); //Queue de max 10 eleman olacak

    public void produce(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            try {
                Integer value=random.nextInt(100);
                queue.put(value);  //eger boyut 10 olmussa bekler
                System.out.println("Producer uretiyor : "+value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void consume(){
        while(true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Integer value=queue.take();  // queue bos ise bekler
                System.out.println("Consumer tuketiyor : "+value);
                System.out.println("Queue size : "+queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
