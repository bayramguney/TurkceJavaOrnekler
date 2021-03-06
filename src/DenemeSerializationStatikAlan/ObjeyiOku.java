package DenemeSerializationStatikAlan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {

        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            Ogrenci ogrenci1=(Ogrenci) in.readObject();

            System.out.println("************************");
            System.out.println(ogrenci1);
            System.out.println("Ogrenci sayisi : "+Ogrenci.getOgrenci_sayisi());
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi ..");
        } catch (IOException e) {
            System.out.println("dosya acilirken hata olustu..");

        } catch (ClassNotFoundException e) {
            System.out.println("sinif bulunamadi ...");
        }
    }
}
