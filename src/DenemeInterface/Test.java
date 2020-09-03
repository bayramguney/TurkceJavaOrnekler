package DenemeInterface;

public class Test {

    public static void main(String[] args) {

        IMuhendis muhendis = new PCMuhendisi(true, true);  // olabilir ustun metodlari alinir
        PCMuhendisi muhendis1 = new PCMuhendisi(false, false);
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgulama();
        muhendis1.mezuniyet_ortalamasi(3.07);
        String[] tecrube = {"Vestel", "Aselsan", "Turkcell"};
        muhendis1.is_tecrubesi(tecrube);
        System.out.println("***************************");


        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);
        String[] tecrube1 = {};
        String[] referans = {"Ahmet", "Veli"};


        muhendis2.askerlik_durumu_sorgula();
        muhendis2.adli_sicil_sorgulama();
        muhendis2.mezuniyet_ortalamasi(2.31);
        muhendis2.is_tecrubesi(tecrube1);
        muhendis2.referans_getir(referans);
        muhendis2.calis();


    }
}