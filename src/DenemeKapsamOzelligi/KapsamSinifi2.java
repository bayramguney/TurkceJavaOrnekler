package DenemeKapsamOzelligi;

public class KapsamSinifi2 {
    private int privateDegisken=30;

    public KapsamSinifi2(){

    }

    public void dahilisinifKontrol(){
        Dahilesinif dahilesinif=new Dahilesinif();
        System.out.println("Kontrol Ediliyor : "+dahilesinif.a); // erisebilir
    }
    public class Dahilesinif{
        private int privateDegisken=20;
        private int a=3;
        public void onileCarp(){
            int privateDegisken=10;
            for (int i = 1; i <6 ; i++) {
                System.out.println(i+"*"+privateDegisken+"="+(i*privateDegisken));// En lokal olani degisken olarak kullanir
                System.out.println(i+"*"+this.privateDegisken+"="+(i*this.privateDegisken));//
                System.out.println(i+"*"+KapsamSinifi2.this.privateDegisken+"="+(i*KapsamSinifi2.this.privateDegisken));//


            }
        }
    }
}
