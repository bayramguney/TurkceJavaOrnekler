package Section15ProjectsYurtDisiException;

public class TestYolcu {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gokce Havaalanina hosgeldiniz :  ");
        String sartlar="Yurtdisi Cikis Kurallari...\n"+
                       "Herhangi bir siyasi yasaginizin bulunmamasi gerekir...\n"+
                       "15 TL harc bedelinizin yatirilmasi gerekir....\n"+
                       "Gideceginiz ulkeye vizenizin olmasi gerekir";
        String message="Yurtdisi sartlarindan hepsini saglamaniz gerekiyor :";

        while(true){
            System.out.println("**************************************");
            System.out.println(sartlar);
            System.out.println("**************************************");

            Yolcu yolcu=new Yolcu();
            System.out.println("Harc bedeli kontrol ediliyor ...");
            Thread.sleep(3000);
            try {
                yolcu.yurtdisi_harci();
            } catch (HarcException e) {
                e.printStackTrace();
            }

            System.out.println("Siyasi yasak kontrol ediliyor ...");
            Thread.sleep(3000);
            try {
                yolcu.siyasi_yasak();
            } catch (SiyasiException e) {
                e.printStackTrace();
            }

            System.out.println("Vize durumunuz kontrol ediliyor ...");
            Thread.sleep(3000);
            try {
                yolcu.vize_durumu();
            } catch (vizeException e) {
                e.printStackTrace();
            }


            System.out.println("********************************************************");
            System.out.println("Islemleriniz tamam.Yurtdisina cikabilirsiniz...");
            System.out.println("********************************************************");

            break;
        }
    }
}
