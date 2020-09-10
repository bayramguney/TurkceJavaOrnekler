package OOP.DenemeInheritance;

public class Yonetici extends Calisan {

   private int sorumlu_kisi;


    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
        super(isim, maas, departman);
        this.sorumlu_kisi=sorumlu_kisi;
    }
    public void zamYap(int zam_miktari){
        System.out.println("Calisanlara  "+zam_miktari+"  TL zam yapildi");
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Sorumlu Kisi : "+this.sorumlu_kisi);
    }

}
