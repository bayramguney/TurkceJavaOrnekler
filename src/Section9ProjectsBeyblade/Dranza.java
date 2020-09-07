package Section9ProjectsBeyblade;

public class Dranza  extends Beyblade{
    private String kutsalCanavar;

    public Dranza(String beybladci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void kutsalCanavariCikar() {
        System.out.println("Kutsal canavar Adi :"+ kutsalCanavar);
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println(getBeybladci()+" "+kutsalCanavar+ " i ortaya cikariyor...");
        System.out.println(getBeybladci()+" in saldirisi  :Alev Kilici");
    }
}
