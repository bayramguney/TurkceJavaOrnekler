package DenemeArray_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void arrayi_bastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " in degeri : " + array[i]);

        }
    }
        public static double ortalamaBul(int[] array){
            int toplam=0;
            for (int i = 0; i <array.length ; i++) {
                toplam+=array[i];
            }
            return (double)toplam/array.length;
        }


    public static void main(String[] args) {

//      int[]  a= {30,40,50,60,70};
//        System.out.println(a[0]);

        int[] b = new int[5];
        for (int i = 0; i <b.length ; i++) {
            b[i]=i*6+5;
        }
        System.out.println(Arrays.toString(b));
        System.out.println("******************************");

        int[] c=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <c.length ; i++) {
            System.out.println("Lutfen bir deger giriniz ...    ");
            c[i]=scanner.nextInt();
        }
        System.out.println("************************************");
        arrayi_bastir(c);
        System.out.println("Arrayin Ortalamsi = " + ortalamaBul(c));


    }
}