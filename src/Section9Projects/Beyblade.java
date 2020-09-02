package Section9Projects;

public class Beyblade {

    private String beybladci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladci, int donusHizi, int saldiriGucu) {
        this.beybladci = beybladci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladci() {
        return beybladci;
    }

    public void setBeybladci(String beybladci) {
        this.beybladci = beybladci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public void saldir(){
        System.out.println(beybladci + " "+saldiriGucu+ " ve "+ saldiriGucu+ " ile saldiriyor...");
    }
    public void kutsalCanavariCikar(){
        System.out.println("bu beybladcinin kutsal canavari yok...");
    }
    public void bilgileriGoster(){
        System.out.println("Beybladci Ismi : " +beybladci);
        System.out.println("Saldiri Gucu : "+saldiriGucu);
        System.out.println("Donus Hizi : "+donusHizi);
    }
}
