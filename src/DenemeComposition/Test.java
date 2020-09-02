package DenemeComposition;

public class Test {
    public static void main(String[] args) {
        Resolution resolution=new Resolution(1920,1080);
        Monitor monitor=new Monitor("VS182DE","Asus","18.5",resolution);
        Kasa kasa=new Kasa("Shadow Blade","Shadow","Temperli cam");
        AnaKart anaKart=new AnaKart("B220 pro","Asus",10,"Windows 10");
        Bilgisayar bilgisayar=new Bilgisayar(monitor,kasa,anaKart);
        bilgisayar.getKasa().bilgisayariAc();
        bilgisayar.getMonitor().monitoruKapat();
        System.out.println(bilgisayar.getAnaKart().getYuva_sayisi());
        bilgisayar.getAnaKart().isletimSistemiYukle("windows 10");


    }
}
