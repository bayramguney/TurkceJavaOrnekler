package Section5Projects;

import java.util.Scanner;

public class Girilien3sayinEnBuyugunuBulma {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("birinci sayi");
        int a=scanner.nextInt();
        System.out.println("ikinci sayi");
        int b=scanner.nextInt();
        System.out.println("ucuncu sayi");
        int c=scanner.nextInt();

        int max=-1;

        if(a>=b && a>=c){
            max=a;
        }else if (b>=a && b>=c){
            max=b;
        }else {
            max=c;
        }

        System.out.println("maximum   : "+max);

    }
}