package Generics.DenemeGeneric;

public class Ogrenci {
    private String isim;

    public Ogrenci(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    @Override
    public String toString() {
        return "isim : " +isim;
    }
}
