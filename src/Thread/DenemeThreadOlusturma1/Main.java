package Thread.DenemeThreadOlusturma1;

public class Main {
    public static void main(String[] args) {

        Printer printer1=new Printer("Printer1");
        Printer printer2=new Printer("Printer2");

        printer1.start();   // Threadler biribirinden bagimsiz calisir kimin once calisacagi pc ye bagli
        printer2.start();



        System.out.println("Main thread calisiyor..");
    }
}
