package DenemeKapsamOzelligi;

public class KapsamSinifi {
    private int privateDegisken=30;

    public KapsamSinifi(){
        System.out.println("privateDegisken : "+privateDegisken);
    }
    public void onileCarp(){
        int privateDegisken=10;
        for (int i = 1; i <6 ; i++) {
            System.out.println(i+"*"+this.privateDegisken+"="+(i*this.privateDegisken)); // this olmasa privateDegisken 10 olur.

        }
    }
}
