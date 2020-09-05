package DenemeFinal;

public class Main {
    public static void main(String[] args) {
        FinalTEst f1=new FinalTEst("obje1");
        FinalTEst f2=new FinalTEst("obje2");
        System .out.println("Obje Sayisi : "+f1.obje_sayisi);
        System .out.println("Obje Sayisi : "+f2.obje_sayisi);

      //  f2.obje_sayisi=10; // final oldugundan degistirilemez...
        System.out.println("Database ismi : "+Database.databaseIsmi);

      //  Database.databaseIsmi="root2"; // degistirilemez


    }
}
