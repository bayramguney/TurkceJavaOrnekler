package DenemeQueue_PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

class Player implements  Comparable<Player> {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player("+"Isim : "+isim + "  "+ " ID : "+id+")";
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;
        } else if (this.id > player.id) {
            return 1;
        } else {
            return 0;
        }
    }
}
    public class Main {
        public static void main(String[] args) {

            Queue<Integer> queue = new PriorityQueue();   // kucukten buyuge dogru queue ye eklenir
            queue.offer(5);
            queue.offer(1);
            queue.offer(2);
            queue.offer(100);      // for each beklenmedi sonuc verir.

            System.out.println(queue.peek());
            System.out.println(queue.contains(10));
            while (!queue.isEmpty()) {
                System.out.println("Eleman Cikariliyor : " + queue.poll());
            }


            System.out.println("******** Objemizi yazdiriyoruz id oncelik sirasi comparable ile tanimli************");
            Queue<Player> player = new PriorityQueue();   // kucukten buyuge dogru queue ye eklenir
            player.offer(new Player("Oguz",5));
            player.offer(new Player("Mehmet",1));
            player.offer(new Player("Oguz",100));

            while (!player.isEmpty()) {
                System.out.println("Eleman Cikariliyor : " + player.poll());
            }

        }
    }
