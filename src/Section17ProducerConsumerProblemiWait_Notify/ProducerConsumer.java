package Section17ProducerConsumerProblemiWait_Notify;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
    Random random=new Random();
    Object lock=new Object();
    Queue<Integer>queue=new LinkedList<>();
    private int limit=10; // Linkedlist in boyu 10 olursa produce engellenecek

    public void produce(){

        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                if (queue.size() == limit) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer uretiyor..." + value);
                lock.notify();
            }

        }
    }
    public void consume(){
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock){
                if(queue.size()==0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value=queue.poll();
                System.out.println("Consumer tuketiyor... : "+value);
                System.out.println("queue size : "+queue.size());
                lock.notify();
            }
        }

    }
}
