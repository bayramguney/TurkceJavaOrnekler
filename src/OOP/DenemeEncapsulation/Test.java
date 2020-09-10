package OOP.DenemeEncapsulation;

public class Test {
    public static void main(String[] args) {
      /*  Abone abone=new Abone();
        abone.isim="Mustafa";
        abone.bakiye=200;
        abone.sehir="Ankara";
        abone.dogalgazKullan(200);*/

      AboneGelismis aboneGelismis=new AboneGelismis("mustafa",200,"Ankara");
      aboneGelismis.bakiyeOgren();
    }
}
