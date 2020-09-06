package DenemeQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Java");      // add metodu ekleyemezse hata firlatir offer ekleyemezse false doner
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");

        System.out.println(queue.peek());    // element metodu kuyruk  hata firlatir peek ise null doner

        for (String s:queue) {
            System.out.println(s);
        }
        System.out.println("Eleman cikariliyor : "+queue.poll());  // bossa null doner : remove hata gonderir
        System.out.println(queue.isEmpty());

        while(!queue.isEmpty()){
            System.out.println("Eleman cikariliyor : "+queue.poll());
        }
    }
}
