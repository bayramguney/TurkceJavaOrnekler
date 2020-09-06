package DenemeVectorStack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");
        for (String s:vector) {
            System.out.println(s);

        }
        ListIterator<String> iterator=vector.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        Enumeration<String> enuma=vector.elements();
        while(enuma.hasMoreElements()){
            System.out.print(enuma.nextElement()+" ");
        }
        System.out.println("Ilk eleman : "+vector.firstElement());
        System.out.println("Sonn eleman : "+vector.lastElement());

        System.out.println("**************************");

        Stack<String> stack=new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("C++");
        stack.push("Go");

        for (String s:stack)
            System.out.println("******************");
        Enumeration<String>enumara=stack.elements();  // veya list iterator kullan
        while(enumara.hasMoreElements()){
            System.out.println(enumara.nextElement());
        }

        System.out.println("son elemani gosterir : "+stack.peek());
        System.out.println("son eleman stack tan cikaririlir : "+stack.pop());

        System.out.println(stack.empty());          // stack bos degilse true

        while(!stack.empty()){
            System.out.println("Eleman cikariliyor : "+stack.pop());
        }
        System.out.println(stack.pop()); // emptystackException verir eger stack bos iken...


    }
}
