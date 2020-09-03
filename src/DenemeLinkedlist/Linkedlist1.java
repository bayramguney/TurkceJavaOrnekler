package DenemeLinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist1 {

   public static void listeyi_yazdir(LinkedList<String> gidilecek_yerler) {
       ListIterator<String > iterator=gidilecek_yerler.listIterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
   }
   public static void sirali_ekle(LinkedList<String > gidilecek_yerler,String yeni){
       ListIterator<String > iterator=gidilecek_yerler.listIterator();
       while(iterator.hasNext()) {
           int karsilastir=iterator.next().compareTo(yeni);
           if(karsilastir==0){
               System.out.println("Listenizde bu eleman zaten var ");
               return;
           }else if(karsilastir<0){

           }else if(karsilastir>0){
               iterator.previous();
               iterator.add(yeni);
               return;
           }

       }
       iterator.add(yeni);
   }


   public static void main(String[] args) {

        ArrayList<String> diller = new ArrayList<>();
        diller.add("Java");
        diller.add(("PHP"));
        diller.add("Kotlin");
        diller.add("C#");
        diller.add("Phyton");

        for (String each : diller) {
            System.out.println(each);

        }
        diller.add(1,"C ++");
        System.out.println("*******************************************");
        LinkedList<String > gidilecek_yerler=new LinkedList<>();
        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kutuphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");

        listeyi_yazdir(gidilecek_yerler);
       System.out.println("************************");
       gidilecek_yerler.add(4,"Alisveris Merkezi");
       listeyi_yazdir(gidilecek_yerler);
       gidilecek_yerler.remove(3);

       System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

       LinkedList<String >gidilecek_yerler2=new LinkedList<>();

       sirali_ekle(gidilecek_yerler2,"Market");
       sirali_ekle(gidilecek_yerler2,"Postane");
       sirali_ekle(gidilecek_yerler2,"Ev");
       listeyi_yazdir(gidilecek_yerler2);








    }

}

