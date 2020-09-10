package OOP.DenemeAbstract;

public class Test {

    public static void main(String[] args) {
        Sekil sekil;
        sekil=new Kare("Kare2",6);
        Kare kare1=new Kare("Kare1",5);
        Daire daire1=new Daire("Daire1",3);

        kare1.alan_hesapla();
        daire1.alan_hesapla();
        sekil.alan_hesapla();
        kare1.cevre_hesapla();    //Sekil uzerinden bu metod gorunmez

    }
}
