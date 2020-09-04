package DenemeGenericEk;

public class Test2AdaySayisalEsitAgirlik {
    public static void main(String[] args) {
        Sayisal sayisal1=new Sayisal(30,40,20,50);
        Sayisal sayisal2=new Sayisal(25,45,2,35);

        EsitAgirlik esitAgirlik1=new EsitAgirlik(30,30,40,2);
        EsitAgirlik esitAgirlik2=new EsitAgirlik(40,10,50,0);

        EsitAgirlik birinci2=birinci(esitAgirlik1,esitAgirlik2);
        Sayisal birinci=birinci(sayisal1,sayisal2);
        System.out.println("Brinci Sayisal ogrencinin puani : "+birinci.puanHesapla());
        System.out.println("Brinci EsitAgirlik ogrencinin puani : "+birinci2.puanHesapla());

    }

    public static <E extends Aday> E birinci(E e1,E e2){
        if(e1.puanHesapla()>e2.puanHesapla()){
            return e1;
        }else{
            return e2;
        }
    }
}
