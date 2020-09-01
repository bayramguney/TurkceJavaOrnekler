package Section7Projects;

public class AsalSayiBulma {

    public static void main(String[] args) {
        for (int i = 2; i <1000 ; i++) {
            if (asalmi(i)) {
                System.out.println(i);
            }
        }
    }

public static boolean asalmi(int sayi ) {

        for (int j = 2; j <sayi ; j++) {
            if(sayi%j==0){
                return false;
            }
        }
    return true;
}
}