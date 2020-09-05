package DenemeInterfaceMethod_Ozellik;

public class Main {
    public static void main(String[] args) {
        System.out.println(IDeneme.a);    // interfaceden object olusturulmadigindan java bize interface uzerinden
                                          // public alana izin verir.
        System.out.println(IDeneme.deneme);
        System.out.println(IDeneme.c);
         IDeneme.deneme();
    }
}
