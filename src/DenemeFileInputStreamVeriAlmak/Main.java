package DenemeFileInputStreamVeriAlmak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream fis=null;
        try {
            fis=new FileInputStream("dosya.txt");
            System.out.println("Birinci Karaketer : "+ (char)(fis.read()));
            System.out.println("Ikinci Karaketer : "+ (char)(fis.read()));

            fis.skip(5);
            System.out.println("Okunan Karakter : "+(char)(fis.read()));

            System.out.println("*************************************");
            int deger;
            String s="";
            int say=0;
            while((deger=fis.read())!=-1){
                s+=(char)deger;
                say ++;
                if(say==8){                       // 8 karakter okuduk 5 i den itibaren
                    break;
                }
            }
            System.out.println("Dosya Icerigi : "+s);


        } catch (FileNotFoundException e) {
            System.out.println("File bulunamadi...");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata olustu...");
        } finally {
            try {
                if(fis!=null){
                fis.close();
                }
            } catch (IOException e) {
                System.out.println("dosya kapatilirken hata olustu...");
            }
        }
    }
}
