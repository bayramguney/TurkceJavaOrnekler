package OOP.DenemePolymosphism;

class Hayvan1 {
    private String isim;

    public Hayvan1(String isim) {
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

class Kedi1 extends Hayvan1 {

    public Kedi1(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "  Miyavliyor...";
    }
}

class Kopek1 extends Hayvan1 {
    public Kopek1(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "  Havliyor.....";
    }
}

class At1 extends Hayvan1 {

    public At1(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "  Kisniyor...";
    }
}

public class Test1 {

    public static void konustur(Object object) {
       // System.out.println(object.konus());
        if(object instanceof Kopek1){
            Kopek1 kopek=(Kopek1)object;
            System.out.println(kopek.konus());
        }else if(object instanceof Kedi1){
            Kedi1 kedi=(Kedi1)object;
            System.out.println(kedi.konus());
        }else if(object instanceof At1){
            At1 at=(At1)object;
            System.out.println(at.konus());
        }else if(object instanceof Hayvan1){
            Hayvan1 hayvan=(Hayvan1)object;
            System.out.println(hayvan.konus());
        }
    }
    public static void main(String[] args) {

        

//        Kopek1 kopek=new Kopek1("Karabas");
//
//        if(kopek instanceof Kopek1){
//            System.out.println("Bu nesne kopek sinifindan ....");
//        }
//        if(kopek instanceof Hayvan1){
//            System.out.println("Bu nesne Hayvan sinifindan ....");
//        }
//        if(kopek instanceof Kedi1){
//            System.out.println("Bu nesne kopek sinifindan ....");
//        }

        Kopek1 kopek=new Kopek1("Karabas");
        Kedi1 kedi=new Kedi1("Tekir");
        At1 at=new At1("Sahbatur");
        Hayvan1 hayvan=new Hayvan1("Hayvan");
        konustur(kopek);
        konustur(at);
        konustur(kedi);
    }

}
