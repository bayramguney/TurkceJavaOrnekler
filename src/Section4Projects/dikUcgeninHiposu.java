package Section4Projects;

import java.util.Scanner;

public class dikUcgeninHiposu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int a, b;
        System.out.print("Birinci kenar : ");
        a=scan.nextInt();

        System.out.print("Ikinci kenar : ");
        b=scan.nextInt();

        double h=Math.sqrt(a*a+b*b);
        System.out.println("Ucgenin hiposu : "+h);



    }
}
