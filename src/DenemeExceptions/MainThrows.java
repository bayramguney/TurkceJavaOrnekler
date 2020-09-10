package DenemeExceptions;

import java.io.IOException;
import java.util.Scanner;

public class MainThrows {
    public static void main(String[] args) {


    Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen yasiniz giriniz  : ");
    int yas=scanner.nextInt();


        try {
            mekan_kontrol(yas);                    // metodda checked exception oldugundan try catch kullandik.
        } catch (IOException e) {                  // try catch kullanmazsak main metoda throws atmamiz lazim
            System.out.println("IOExecption kullanildi...");   //ama biz yakalamazsak bunu kullanan handle eder
        }


    }
    public static void mekan_kontrol(int yas) throws IOException {
        if(yas<18){
            throw new IOException();       // eger checked exception kullanirsak throws eklenir
        }else{
            System.out.println("Mekana Hosgeldiniz...");
        }
    }
}
