package DenemeCollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {

        Map <Integer,String> map=new HashMap<>();
        map.put(10,"Java");
        map.put(30,"Python");
        map.put(50,"Php");
        map.put(20,"Php");
        map.put(10,"C++");  // javanin yerini degistirdi ...
        System.out.println(map);
        System.out.println(map.get(50));
        System.out.println(map.get(100));    //  null verir;

        for (Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.println("Anahtar :"+entry.getKey());
            System.out.println("Deger:"+entry.getValue());
        }


    }
}
