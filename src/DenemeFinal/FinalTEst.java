package DenemeFinal;

public class FinalTEst {
    public final int obje_sayisi;// constructer icinde de final tanimlanabilir
    private static int say = 0;
    private final String isim;

    public FinalTEst(String isim) {
        this.isim = isim;
        say++;
        obje_sayisi = say;
    }

    public int getObje_sayisi() {
        return obje_sayisi;
    }
}
