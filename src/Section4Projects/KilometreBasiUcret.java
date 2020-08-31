package Section4Projects;

import java.util.Scanner;

public class KilometreBasiUcret {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Araciniz kilometre basi kac kurus yakiyor ?   (Ornek  : 0.32  ");
        double kurus=scan.nextDouble();

        System.out.print("Aracinizla kac kilometre yol gittiniz  ");

        int yol=scan.nextInt();

        System.out.println("Toplam odemeniz gereken tutar  "+(kurus*yol)+" TL dir");

    }
}
