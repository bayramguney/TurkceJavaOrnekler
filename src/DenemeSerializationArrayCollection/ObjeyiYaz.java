package DenemeSerializationArrayCollection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {
            Ogrenci ogrenci1=new Ogrenci("Mustafa Murat",1234,"Bilgisayar Muhendisligi");
            Ogrenci ogrenci2=new Ogrenci("Oguz",678,"Insaat Muhendisligi");
            Ogrenci ogrenci3=new Ogrenci("Mehmet",123,"Bilgisayar Muhendisligi");

            Ogrenci[] ogrenci_array={ogrenci1,ogrenci2,ogrenci3};
            ArrayList<Ogrenci>ogrenci_list=new ArrayList<>(Arrays.asList(ogrenci_array));


        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){

            out.writeObject(ogrenci_array);
            out.writeObject(ogrenci_list);

        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi..");
        } catch (IOException e) {
            System.out.println("dosya acilirken IOException olustu...");
        }

    }
}
