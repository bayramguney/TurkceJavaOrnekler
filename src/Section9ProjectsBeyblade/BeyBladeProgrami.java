package Section9ProjectsBeyblade;

import java.util.Scanner;

public class BeyBladeProgrami {
    public static void main(String[] args) {
        System.out.println(" Beyblade Programina Hosgeldiniz....");
        System.out.println(" Cikis icin q ye basiniz..");

        Scanner scanner =new Scanner(System.in);

        while(true){
            System.out.println("****************************************");
            System.out.print("Hangi beyblade i uretmek istiyorsunuz..? ");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }else{
                BeybladeFabrikasi beybladeFabrikasi=new BeybladeFabrikasi();
                Beyblade beyblade=beybladeFabrikasi.beybladeUret(islem);
                if(beyblade==null){
                    System.out.println("Lutfen gecerli bir beyblade ismi giriniz...");
                }else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavariCikar();

                }
            }
        }
    }
}
