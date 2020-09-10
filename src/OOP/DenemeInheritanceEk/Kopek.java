package OOP.DenemeInheritanceEk;

public class Kopek extends Hayvan {
    private int dis_sayisi;


    public Kopek(String isim, int kilo, int boy, int bacak_sayisi,int dis_sayisi) {
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi=dis_sayisi;
    }

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    public void kos(int hiz ){
        System.out.println("Kopek kosuyor....");
        super.hareketeGec(hiz);
    }
    public void hareketeGec(int hiz){
        System.out.println("Kopek "+hiz+" km hiz ile harekete geciyor ...");
    }
}
