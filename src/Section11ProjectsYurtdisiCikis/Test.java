package Section11ProjectsYurtdisiCikis;

public class Test {

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
            if(yolcu.yurtdisi_harci()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor ...");
            Thread.sleep(3000);
            if(yolcu.siyasi_yasak()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumunuz kontrol ediliyor ...");
            Thread.sleep(3000);
            if(yolcu.vize_durumu()==false){
                System.out.println(message);
                continue;
            }


            System.out.println("********************************************************");
            System.out.println("Islemleriniz tamam.Yurtdisina cikabilirsiniz...");
            System.out.println("********************************************************");

            break;
        }
    }
}
