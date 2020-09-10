package JavaInputOutput.DenemeFileOutputStreamVeriYazmak;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos=null;
    //    File file=new File("dosya.txt");
        try {
            fos=new FileOutputStream("dosya.txt",true);  //dosya varsa uzerine ekleme yapilir true ile
            fos.write(65);   // ASCII karakrleri yazilir
            fos.write(74);
            byte[]array={101,34,56,78};
            fos.write(array);
            String s="Mustafa Murat";
            byte[] s_array=s.getBytes();
            fos.write(s_array);
        } catch (FileNotFoundException e) {
            System.out.println("File Not found olustu...");
        } catch (IOException e) {
            System.out.println("dosyaya yazilirken hata olustu");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya Kaptilirken hata olustu...");
            }
        }

    }
}
