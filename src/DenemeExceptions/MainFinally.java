package DenemeExceptions;

public class MainFinally {
    public static void main(String[] args) {

        try{
            String s=null;
            System.out.println(s.hashCode());     // hata yakalanmazsa program kapanir..
        }catch (NullPointerException e)
        {
            System.out.println("Null referans hatasi");
            e.printStackTrace();
        }finally {
            System.out.println("Finally block calisiyor ....");
        }



        System.out.println("*******************************");
        try{
            String s=null;
            System.out.println(s.hashCode());     // hata yakalanmazsa program kapanir..
        }catch (ArithmeticException e)
        {
            System.out.println("Null referans hatasi");
            e.printStackTrace();
        }finally {
            System.out.println("Finally block calisiyor ....");
        }
        System.out.println("burasi calismaz ....");


    }


}
