package DenemeInnerClassStatikOlan;

public class Matematik {

    private static double pi=Math.PI;

    public static class Alan{

        public static void daire_alan(int yaricap){
            System.out.println("Dairenin Alani : "+(yaricap*yaricap*pi));
        }
    }
}
