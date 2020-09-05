package DenemeCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist=new LinkedList<>();
        ArrayList<Integer>arrayList=new ArrayList<>();
        zamanHesapla("LinkedList",linkedlist);
        zamanHesapla("Arraylist",arrayList);

    }
    public static void zamanHesapla(String veri_tipi, List<Integer> list){
        // listin sonuna deger ekleme
        long baslangic;
        long bitis;
        baslangic=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            list.add(0,i);
        }
        bitis=System.currentTimeMillis();
        System.out.println(veri_tipi+ " ekleme suresi " +(bitis-baslangic));
// listenin sonuna eklemede arraylist,basa eklemede linkedlist hizlidir ********************
    }
}
