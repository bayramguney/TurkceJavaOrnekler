package DenemeSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){

            Ogrenci ogrenci1=new Ogrenci("Mustafa Murat",1234,"Bilgisayar Muhendisligi");
            Ogrenci ogrenci2=new Ogrenci("Oguz",1539,"Insaat Muhendisligi");
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);

        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi..");
        } catch (IOException e) {
            System.out.println("dosya acilirken IOException olustu...");
        }

    }
}
