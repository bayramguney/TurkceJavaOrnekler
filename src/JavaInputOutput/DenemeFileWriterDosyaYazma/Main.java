package JavaInputOutput.DenemeFileWriterDosyaYazma;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileWriter writer=null;    // finally blok unda gorunmesi icin null baslattik
        try {
            writer=new FileWriter("dosya1.txt",true);
            writer.write("Mustafa Murat Coskun\n");
            writer.write("Mehmet yilmaz\n");

            writer.write("Oguz atan\n");
        } catch (IOException e) {
            System.out.println("dosya acilirken IOException olustu ...");
        }finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("dosya kapatilirken bir hata olustu...");
                }
            }
        }

    }
}
