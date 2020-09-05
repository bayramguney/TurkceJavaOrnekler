package DenemeCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("PHP");

        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("PHP");

        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("PHP");
        System.out.println(" Hashed SEt ***********");
        for (String each:set1) {
            System.out.println(each); }
        System.out.println(" Linked Hash SEt ***********");
        for (String each:set2) {
            System.out.println(each); }
        System.out.println(" Tree SEt ***********");
        for (String each:set3) {
            System.out.println(each); }

        set1.contains("Java");
        set1.isEmpty();
        set1.remove("Java");

        Set<String> seta=new HashSet<>();
        Set<String>setb=new HashSet<>();

        seta.add("Java");
        seta.add("Python");
        seta.add("C++");
        seta.add("JavaScript");
        seta.add("PHP");

        setb.add("Go");
        setb.add("Java");
        setb.add("CSS");

        Set<String>fark=new HashSet<>(setb);
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);

        Set<String>kesisim=new HashSet<>(setb);
        System.out.println(kesisim.retainAll(seta));
        System.out.println(kesisim);


    }
}

