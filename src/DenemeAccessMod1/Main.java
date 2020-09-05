package DenemeAccessMod1;
import DenemeAccessMod2.Araba;
import DenemeAccessMod2.Hayvan;

public class Main {
    public static void main(String[] args) {
        Araba araba=new Araba();
        System.out.println(araba.renk);

        Hayvan hayvan=new Hayvan("hayvan");
  //      System.out.println(hayvan.isim);  diger paketin protected alanina erisemzsin inheritance olmali
    }
}
