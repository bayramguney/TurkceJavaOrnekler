package DenemeThreadSenkronizasyonu1denFazlaLock;

public class Main {
    public static void main(String[] args) {
       ListWorker worker=new ListWorker();
       long baslangic=System.currentTimeMillis();
       worker.degerAta();
       long bitis=System.currentTimeMillis();
        System.out.println("Gecen  Sure : "+(bitis-baslangic));


    }
}
