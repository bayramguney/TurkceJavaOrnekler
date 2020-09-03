package DenemeArray_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static int[] arrayi_doldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            System.out.print("Lutfen bir sayi giriniz .... : ");
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }

    public static void arrayiBastir(int[] array) {
        int i = 1;
        for (int each : array) {
            System.out.println("Element  " + i + " in degeri  : " + each);
            i++;
        }
    }

    public static void array_sort(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] a = arrayi_doldur(3);
        System.out.println("**********************");
//        array_sort(a);
//        arrayiBastir(a);


        int[] b1={1,2,3,4};
        int[] b2={1,2,3,4};
        System.out.println(b1==b2?"esit":"Esit Degil");
        System.out.println(Arrays.equals(b1,b2)?"esit":"Esit Degil");

        for (int each:b1) {
            System.out.print(each+" ");

        }

    }
}
