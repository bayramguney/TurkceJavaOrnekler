package DenemeSerialization;
//yuklu dosayalari serilize ederek daha sonraki kullnimlarda hiz saglanir
import java.io.Serializable;

public class Ogrenci  implements Serializable {
    private static final long serialVersionUID=1000;   // version numarasi ataniyor
    private String isim;
    private int id;
    private String bolum;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "Ogrenci ismi : " + isim +
                "\nOgrenci numarasi : " + id +
                "\nOgrenci bolumu : " + bolum;

        return bilgiler;

    }
}