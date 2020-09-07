package DenemeExceptions;

public class Main {
    public static void main(String[] args) {


        try {
            int a = 30 / 0;     //unchecked  AritmeticExc.
        } catch (ArithmeticException e) {        // veya ust exception class da yazilabilr Exception
            System.out.println("Bir sayi sifira bolunemz..");
        }


        try {
            int[] b = {1, 2, 3, 4};
            System.out.println(b[5]);    // ArrayindexOutofbounce,IndexoutofboundException,runtime
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Array in boyunu astiniz...");
        }


        try {
            String c = null;
            System.out.println(args.length);    //NullpointerExc
            int d = 30 / 0;
        }
        catch (ArithmeticException  e){
            System.out.println("bir sayi sifira bolunemez...");
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array in boyunu astiniz...");
        }
        catch(Exception e){
            System.out.println("bir hata olustu..");
            e.printStackTrace();
        }





    }
}
