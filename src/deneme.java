import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {


    }


    public static void selamlama(String name) {
        System.out.println("Merhaba Nasilsiniz " + name);
        System.out.println("Selamlar...." + faktoriyelAl(toplama(3,4)));


    }

    public static void factoriyelAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz   ");
        int sayi = scanner.nextInt();

        int factoriyel = 1;
        while (sayi > 0) {
            factoriyel *= sayi;
            sayi--;
        }
        System.out.println(factoriyel);
    }

    public static int toplama(int a, int b, int c) {
        int toplam = a + b + c;
        return toplam;

    }
    public static int toplama(int a,int b){
        return a+b;
    }

    public static int faktoriyelAl(int sayi) {
        int factoriyel = 1;
        while (sayi > 0) {
            factoriyel *= sayi;
            sayi--; }
return factoriyel;
    }

}