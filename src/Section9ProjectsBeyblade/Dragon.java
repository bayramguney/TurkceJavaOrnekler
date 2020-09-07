package Section9ProjectsBeyblade;

public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private  String gizliYetenek;

    public Dragon(String beybladci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek) {
        super(beybladci, donusHizi, saldiriGucu);
        this.gizliYetenek=gizliYetenek;
        this.kutsalCanavar=kutsalCanavar;
    }

    @Override
    public void kutsalCanavariCikar() {
        System.out.println(getBeybladci()+" "+kutsalCanavar+ " i ortaya cikariyor...");
        System.out.println(getBeybladci()+" in saldirisi  : Hayalet Kasirgasi ");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adi : "+kutsalCanavar);
        System.out.println("Gizli Yetenek : "+gizliYetenek);
    }
}
