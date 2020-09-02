package DenemeEncapsulation;

public class AboneGelismis {
    private String abone_isim;
    private int bakiye=120;
    private String sehir;

    public AboneGelismis(String abone_isim, int bakiye, String sehir) {
        this.abone_isim = abone_isim;
        if(bakiye>0 && bakiye<=120) {
            this.bakiye = bakiye;
        }
        this.sehir = sehir;
    }
    public void dogalgazKullan(int miktar){
        if((this.bakiye-miktar)<0){
            System.out.println("Yeterli bakiye yok ...");
        }else {
            this.bakiye-=miktar;
            if(this.bakiye<=0){
                System.out.println("Bakiyeniz bitmistir.Lutfen en yakin abone merkezine gidiniz..."+
                        "Kredi limiti 120 TL");
            }else{
                System.out.println("Yeni bakiye : "+bakiye);
            }
        }

    }
    public void bakiyeOgren(){
        System.out.println("Bakiye = "+bakiye);
    }
}
