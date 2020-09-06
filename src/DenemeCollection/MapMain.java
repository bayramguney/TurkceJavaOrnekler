package DenemeCollection;

import java.util.*;

public class MapMain {
   public static void mapYazdir(Map<Integer,String> map){
       map.put(10, "C++");
       map.put(5, "Java");
       map.put(1, "Python");
       map.put(2, "Php");
       map.put(100, "C");

       for (Map.Entry<Integer,String>entry:map.entrySet()) {
           System.out.println("Anahtar :"+entry.getKey()+" Deger : "+entry.getValue());
       }

   }

    public static void main(String[] args) {
        Map<Integer,String>hashmap=new HashMap<>();
        Map<Integer,String>linkedhashmap=new LinkedHashMap<>();
        Map<Integer,String>treehashmap=new TreeMap<>();

        mapYazdir(hashmap);          // siralama belirsiz
        mapYazdir(linkedhashmap);   // ekleme sirasi
        mapYazdir(treehashmap);     // siralama olur kucujten buyuge

        System.out.println(hashmap.keySet());
        for (Integer key:hashmap.keySet()) {
            System.out.println("Anahtar : "+key+ " Value  : "+hashmap.get(key));
        }

        Collection<String>values=hashmap.values();
        for (String s:values){
            System.out.println("Deger : "+ s);
        }

    }
}
