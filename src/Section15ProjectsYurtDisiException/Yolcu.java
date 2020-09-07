package Section15ProjectsYurtDisiException;

import Section11ProjectsYurtdisiCikis.IYurtdisiKurallari;

import java.util.Scanner;

class SiyasiException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("siyasi yasaginiz bulunuyor...");
    }
}
    class vizeException extends Exception {

        @Override
        public void printStackTrace() {
            System.out.println("Gideceginiz ulkeye vizeniz bulunmuyor...");
        }
    }
        class HarcException extends Exception {

            @Override
            public void printStackTrace() {
                System.out.println("Lutfen yurtdisi harcini tam yatirin ...");
            }

        }

        public class Yolcu  {

            private int harc;
            private boolean siyasiYasak;
            private boolean vizeDurumu;


            public Yolcu() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Yatirdiginiz harc bedeli : ");
                this.harc = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Siyasi yasaginiz var mi  (evet veya hayir ) : ");
                String cevap = scanner.nextLine();
                if (cevap.equals("evet")) {
                    this.siyasiYasak = true;
                } else {
                    this.siyasiYasak = false;
                }

                System.out.println("Vizeniz bulunuyor mu  ( evet veya hayir ):");
                String cevap2 = scanner.nextLine();
                if (cevap2.equals("evet")) {
                    this.vizeDurumu = true;
                } else {
                    this.vizeDurumu = false;
                }


            }

            public void yurtdisi_harci() throws HarcException {
                if (this.harc < 15) {
throw new HarcException();
                } else {
                    System.out.println("Yurt disi harci islemi tamam ..");

                }
            }


            public void siyasi_yasak() throws SiyasiException {
                if (this.siyasiYasak == true) {

throw new SiyasiException();
                } else {
                    System.out.println("Siyasi yasaginiz bulunmuyor....");

                }
            }

            public void vize_durumu() throws vizeException {
                if (this.vizeDurumu == true) {
                    System.out.println("vize islemleri tamam ...");
                } else {
throw new vizeException();
                }
            }
        }
