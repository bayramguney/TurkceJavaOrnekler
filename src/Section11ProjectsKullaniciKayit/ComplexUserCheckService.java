package Section11ProjectsKullaniciKayit;

public class ComplexUserCheckService implements IUserCheckService {

    @Override
    public boolean checkUser(User user) {
        if (user.getAge() >= 18 && user.getName().startsWith("Mu")) {
            return true;
        } else {
            return false;

        }

    }
}