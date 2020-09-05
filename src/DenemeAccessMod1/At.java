package DenemeAccessMod1;

import DenemeAccessMod2.Hayvan;

public class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }
    public void isminiSoyle(){
        System.out.println(super.isim); // inheritanse oldugu icin ust sinifin protected alanina ulasirsin

    }
}
