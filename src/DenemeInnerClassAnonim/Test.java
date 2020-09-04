package DenemeInnerClassAnonim;

public class Test {
    // android development ta cok kullanilir bu method...
    public static void main(String[] args) {
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders calisiyorum..");

            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum ..");

            }
        };
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        System.out.println("****************************");

        AOgrenci aOgrenci2 = new AOgrenci("Mustafa",213) {
            @Override
            void kayit_yaptir() {
                System.out.println("Kayit yapiliyor ...."+" Isim : "+getIsim()+" Numara : "+getNumara());

            }
        };
        aOgrenci2.kayit_yaptir();
        aOgrenci2.selamla();


    }

    public abstract static class AOgrenci {
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }

        abstract void kayit_yaptir();

        public void selamla() {
            System.out.println("Selamlar ...");
        }
    }

    public interface IOgrenci {
        void ders_calis();

        void derse_gir();
    }


}
