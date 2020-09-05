package DenemeCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Phyton");
        list.add("C++");
        list.add("Java");

        System.out.println(list.get(0));
        System.out.println(list.get(2));
       // System.out.println(list.get(4));  // hata verir

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+ " ");
        }
        for (String each:list) {
            System.out.println(each);
        }
        list.remove(1);
        list.remove("Java"); // ilk java silinir...






    }
}
