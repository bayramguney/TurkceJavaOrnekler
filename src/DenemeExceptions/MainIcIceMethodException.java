package DenemeExceptions;
// icice exception larda stack kullanilir..
public class MainIcIceMethodException {

    public static void ucuncufonksiyon(){
        try {

        }catch (ArithmeticException e){
            System.out.println("bir sayi sifira bolunemez ...");
        }

    }
    public static void ikincifonksiyon(){
        ucuncufonksiyon();              // hata 3.metodda olustudugu icin try catch burada da yapilabilir
    }
    public static void birincifonksiyon(){
        ikincifonksiyon();
    }



    public static void main(String[] args) {
        birincifonksiyon();

    }
}
