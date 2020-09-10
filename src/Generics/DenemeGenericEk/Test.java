package Generics.DenemeGenericEk;

public class Test {
    public static void main(String[] args) {
        Character[] char_dizi = {'J', 'A', 'V', 'A'};
        Integer[] integer_dizi = {1, 2, 3, 4, 5, 6};
        String[] string_dizi = {"Java", "Phyton", "C++", "PHP"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"), new Ogrenci("Coskun"), new Ogrenci("Merve")};

        yazdir(char_dizi);
        yazdir(integer_dizi);
        yazdir(string_dizi);
        yazdir(ogrenci_dizi);

    }

    public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            System.out.print(e+" ");

        }
        System.out.println();
    }
}
