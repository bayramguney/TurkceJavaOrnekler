package DenemeInnerClassStatikolmayan;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Matematik.Factorial factorial=new Matematik().new Factorial();
        Matematik.Asal asal=new Matematik().new Asal();
       //Matematik.Alan alan=new Matematik().new Alan();
        Matematik.Alan.DaireAlan alan=new Matematik().new Alan().new DaireAlan();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Bir tane sayi giriniz : ");
        int sayi=scanner.nextInt();

        if(asal.asal_mi(sayi)){
            System.out.println("Bu sayi asaldir ...");
        }else{
            System.out.println("Bu sayi asal degildir..");
        }
        factorial.faktoriyel();
        alan.daire_alan(5);

    }
}
