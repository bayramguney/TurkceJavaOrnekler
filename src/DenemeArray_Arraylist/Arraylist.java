package DenemeArray_Arraylist;

import java.util.ArrayList;

public class Arraylist {

    public static void yazdir(ArrayList<String> arraylist){
        for (String each:arraylist) {
            System.out.print(each+ " "); }


    }

    public static void main(String[] args) {
        ArrayList<String> arraylist=new ArrayList<>();
        arraylist.add("Metalica");
        arraylist.add("Black Sabbaht");
        arraylist.add("Iron Maiden");
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.size());

        arraylist.remove("Metalica");
        arraylist.remove(0);
        System.out.println(arraylist.indexOf("Iron Maiden"));
        System.out.println(arraylist.lastIndexOf("Metalica"));


           arraylist.set(0,"Tarkan");
           arraylist.set(0,"Bendeniz");
           arraylist.add("Ibo");

           yazdir(arraylist);







    }

}
