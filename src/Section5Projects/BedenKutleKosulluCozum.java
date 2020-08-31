package Section5Projects;

import java.util.Scanner;

public class BedenKutleKosulluCozum {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print ("kilonuzu girin   ");
        int kilo=scanner.nextInt();
        System.out.print ("boyunuzu girin   : (ornek 1.74   ");
        double boy=scanner.nextDouble();

        double bki=(kilo/(boy*boy));

        if(bki<18.5){
            System.out.println("zayif");
        }else if (bki>=18.5 && bki<25){
            System.out.println("normal");
        }else if (bki>=25 && bki<30){
            System.out.println("fazla kilolu");
        }else{
            System.out.println("obez");
        }

    }

}
