package Section11ProjectsYurtdisiCikis;

import java.util.Scanner;

public class Yolcu implements IYurtdisiKurallari{

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
    @Override
    public boolean yurtdisi_harci() {
        if (this.harc < 15) {
            System.out.println("Lutfen yurt disi cikis harcini tam yatirin ..");
            return false;
        } else {
            System.out.println("Yurt disi harci islemi tamam ..");
            return true;
        }
    }

    @Override
    public boolean siyasi_yasak() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasaginiz bulunuyor. Yurt disina cikamasiniz..");
            return false;
        } else {
            System.out.println("Siyasi yasaginiz bulunmuyor....");
            return true;
        }
    }
    @Override
    public boolean vize_durumu() {
       if(this.vizeDurumu==true){
           System.out.println("Vize islemleri tamam..");
        return true;
    }else {
           System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktatir..");
           return  false;
       }
}
}
