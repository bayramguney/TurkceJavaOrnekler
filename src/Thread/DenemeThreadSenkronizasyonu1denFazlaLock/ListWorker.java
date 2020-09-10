package Thread.DenemeThreadSenkronizasyonu1denFazlaLock;

import java.util.ArrayList;
import java.util.Random;

public class ListWorker {
    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();


    public void list1Degerekle() {
        for (int i = 0; i < 2000; i++) {
            list1.add(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
        public void list2Degerekle() {
            for (int i = 0; i < 2000; i++) {
                list2.add(i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        public void degerAta(){
        list1Degerekle();
        list2Degerekle();

            System.out.println("List1 : "+list1.size()+" List2 : "+list2.size());
        }
    }
