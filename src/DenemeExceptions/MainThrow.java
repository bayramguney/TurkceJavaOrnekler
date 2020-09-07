package DenemeExceptions;

import java.util.Scanner;

public class MainThrow {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen yasiniz giriniz  : ");
        int yas=scanner.nextInt();

        try {
            mekan_kontrol(yas);
        }catch(ArithmeticException e){
            System.out.println("18 yasdan kucukler mekana giremez ...");
        }

    }
    public static void mekan_kontrol(int yas){
        if(yas<18){
            throw new ArithmeticException();
        }else{
            System.out.println("Mekana Hosgeldiniz...");
        }
    }
}
