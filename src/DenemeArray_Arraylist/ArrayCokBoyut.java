package DenemeArray_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCokBoyut {

    public static void main(String[] args) {
        int[][] a = new int[2][5];
        a[0][0] = 2;
        a[0][1] = 3;
        a[1][1] = 6;
        a[1][1] = 34;
        int[][] b = {{23, 32}, {56, 45}};
        System.out.println(b[0][1]);
        int[][] c=new int[2][2];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Bir deger giriniz .. ");
                c[i][j]=scanner.nextInt();
            }


        }
        System.out.println(Arrays.deepToString(c));
        for (int[] each:b) {
            for (int ea:each) {
                System.out.print(ea +" ");
            }

        }

    }
}
