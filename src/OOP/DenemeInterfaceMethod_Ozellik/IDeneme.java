package OOP.DenemeInterfaceMethod_Ozellik;

public interface IDeneme {
     //private int a=4; // private ozellik eklenmez
    // public int b;   // bu sekilde olamaz...
    public int a=4;

    public static String deneme="Deneme";
   //  public final int c; // final alana kesinlikle deger verirmeli.constructer olusturulamiyor
    public int c=6;

    public static void deneme(){    // interface metod eklememiz icin MUTLAKA statik olmali
        System.out.println("Deneme");
    }

}
