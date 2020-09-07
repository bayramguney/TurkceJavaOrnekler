package DenemeSerializationStatikAlan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci("Mustafa Murat",1234,"Bilgisayar Muhendisligi");
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){

           Ogrenci.setOgrenci_sayisi(100);
           out.writeObject(ogrenci1);


        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi..");
        } catch (IOException e) {
            System.out.println("dosya acilirken IOException olustu...");
        }

    }
}
