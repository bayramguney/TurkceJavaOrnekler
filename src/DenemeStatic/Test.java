package DenemeStatic;

public class Test {
    public static void main(String[] args) {

        Seyirci seyirci1=new Seyirci("Nustafa");
        Seyirci seyirci2=new Seyirci("Ahmet");
        seyirci1.oyun_seyret();
        System.out.println("Seyirci sayisi : "+Seyirci.getSeyirci_sayisi());
        System.out.println("Seyirci sayisi : "+seyirci1.getSeyirci_sayisi());
        System.out.println("Seyirci sayisi : "+seyirci2.getSeyirci_sayisi());

        selamla();
        System.out.println(Math.PI);
    }
    public static void selamla(){
        System.out.println("Selamlar : ");
    }
}
