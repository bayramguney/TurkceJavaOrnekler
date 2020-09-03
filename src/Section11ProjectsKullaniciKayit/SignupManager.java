package Section11ProjectsKullaniciKayit;

public class SignupManager {
    private IUserCheckService iUserCheckService;

    public SignupManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void signup(User user) {
        if (iUserCheckService.checkUser(user)) {
            System.out.println("Kullanici kayit oldu : " + user.getName());
        } else {

            System.out.println("Kullanici kayit olamadi : ");
        }
    }
}