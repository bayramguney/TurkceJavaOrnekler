package DenemeSerializationStatikAlan;

import java.io.Serializable;

public class Ogrenci  implements Serializable {
    private transient String isim;
    private transient int id;     // id serilize disi olmus oldu
    private String bolum;
    private static int ogrenci_sayisi;   // java static alanlari serilize etmez

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }

    @Override
    public String toString() {
        String bilgiler = "Ogrenci ismi : " + isim +
                "\nOgrenci numarasi : " + id +
                "\nOgrenci bolumu : " + bolum;

        return bilgiler;

    }
}