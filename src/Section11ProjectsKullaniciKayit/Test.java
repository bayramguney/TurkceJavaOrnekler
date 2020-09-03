package Section11ProjectsKullaniciKayit;

public class Test {

    public static void main(String[] args) {
        SignupManager signupManager=new SignupManager(new ComplexUserCheckService());
        signupManager.signup(new User(1,"Mistafa",26));

    }
}
