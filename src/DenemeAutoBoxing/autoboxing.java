package DenemeAutoBoxing;

import java.util.ArrayList;

public class autoboxing {


    public static void main(String[] args) {

        ArrayList<Integer> arraylist=new ArrayList<>();
        ArrayList<Character>chararraylist=new ArrayList<>();
        ArrayList<Float>floatArrayList=new ArrayList<>();

        Integer a=5;
        System.out.println(a.toString());

        for (int i = 0; i <10 ; i++) {
           // arraylist.add(Integer.valueOf(i));             // Autoboxing ama gerek yok auto olarak cevrilir..
            arraylist.add(i);
        }
        for (int i = 0; i <10 ; i++) {
           // System.out.println(arraylist.get(i).intValue());   // unboxing
            System.out.println(arraylist.get(i));
        }




    }

}
