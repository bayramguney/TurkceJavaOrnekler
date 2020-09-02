package DenemePolymosphism;

class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konusuyor....";
    }
}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "  Miyavliyor...";
    }
}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "  Havliyor.....";
    }
}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "  Kisniyor...";
    }
}

public class Test {

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("Limon");
        System.out.println(hayvan.konus());
        Hayvan hayvan1 = new Kedi("Tekir");
        System.out.println(hayvan1.konus());
        Hayvan hayvan2 = new Kopek("Karabas");
        System.out.println(hayvan2.konus());
        Hayvan hayvan3 = new At("Sergen");
        System.out.println(hayvan3.konus());

        System.out.println("******************");

        konustur(new Kedi("Tekir"));
        konustur((new Kopek("Karabas")));


    }

}
