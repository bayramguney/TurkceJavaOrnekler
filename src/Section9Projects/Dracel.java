package Section9Projects;

public class Dracel extends Beyblade {
   private String kutsalCanavar;
    public Dracel(String beybladci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void kutsalCanavariCikar() {
        System.out.println(getBeybladci()+" "+kutsalCanavar+ " i ortaya cikariyor...");
        System.out.println(getBeybladci()+" in saldirisi  : Kale Savunmasi ");


    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adi : "+kutsalCanavar);
    }
}
