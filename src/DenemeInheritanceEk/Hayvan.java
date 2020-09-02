package DenemeInheritanceEk;

public class Hayvan {
    private String isim;
    private int kilo;
    private int boy;
    private int bacak_sayisi;

    public Hayvan(String isim, int kilo, int boy, int bacak_sayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
    }
    public void yemekYe(){
        System.out.println("hayvan su an yemek yiyor  ...");
    }
    public void hareketeGec(int hiz){
        System.out.println("Hayvan "+hiz+" km hiz ile harekete geciyor ...");
    }
}
