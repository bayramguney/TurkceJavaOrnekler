package DenemeStatic;

public class StatikClass {
    private static String isim;
    public static int obje_sayisi=0;
    public StatikClass(String isim){
        this.isim=isim;
        obje_sayisi ++;
    }

    public static String getIsim(){
        return isim; //field statik olmali burda kullnamak icin
    }
}
