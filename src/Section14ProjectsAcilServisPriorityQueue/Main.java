package Section14ProjectsAcilServisPriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Hasta>acilservis=new PriorityQueue();
        acilservis.offer(new Hasta("Murat","Yanik"));
        acilservis.offer(new Hasta("Okan","Bas Agrisi"));
        acilservis.offer(new Hasta("Elif","Apandisit"));
        acilservis.offer(new Hasta("Ogus","Yanik"));
        acilservis.offer(new Hasta("Merve","Yanik"));
        acilservis.offer(new Hasta("Gizem","Apandisit"));

        int i=1;

        while(!acilservis.isEmpty()){
            System.out.println("******************");
            System.out.println(i+" .sirada ");
            System.out.println(acilservis.poll());
            System.out.println("******************");
            i++;
        }




    }
}
