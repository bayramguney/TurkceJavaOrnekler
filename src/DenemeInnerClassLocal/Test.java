package DenemeInnerClassLocal;

import DenemeInnerClassStatikOlan.Matematik;

public class Test {

    public static void main(String[] args) {
        // Ayni class da object olusturmak istedigimizde kullanisli...
        class Alan{

            public void daire_alan(int yaricap){
                System.out.println("Dairenin Alani : "+(yaricap*yaricap*Math.PI));
            }
        }

        Alan alan=new Alan();
        Alan alan2=new Alan();
        alan.daire_alan(4);
        alan2.daire_alan(3);

    }
    public static void deneme(){
    //    Alan alan2=new Alan();   metodun disinda inner class lara ulasilamaz,,,


    }


}
