package Section11ProjectsGeometrikSekilAlani;

public class Daire extends  Sekil {
    private int yaricap;

    public Daire(String isim,int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }


    @Override
    public void alan_hesapla() {
        System.out.println(getIsim() + " alani "+ (Math.PI *yaricap*yaricap)+ " dir");

    }
}
