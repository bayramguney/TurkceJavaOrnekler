package DenemeStatic;

public class TestStatikClass {
    public static void main(String[] args) {
        StatikClass s1 = new StatikClass("Ali");
        StatikClass s2 = new StatikClass("Veli");

        System.out.println("Obje sayisi : "+StatikClass.obje_sayisi);
        System.out.println("Obje sayisi : "+s1.obje_sayisi);
    //    toplama(2,4);  // eger toplama statik degilse obje olusturmak gerekir..

        TestStatikClass t1=new TestStatikClass();
        t1.toplama(1,3);

    }
    public  void toplama(int a,int b){
        System.out.println(a+b);
    }
}