package Section8ProjectATM;

public class AtmProjesiNesneYonelimli {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap=new Hesap("Mustafa","12345",2000);

        atm.calis(hesap);
        System.out.println("Programdan cikiliyor.....");
    }
}
