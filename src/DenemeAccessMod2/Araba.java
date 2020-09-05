package DenemeAccessMod2;

 public class Araba {   // public yerine default olsaydi access mod1 den ersilmez; burada private ve protected izin yok.
    public String model="Reno";   // private olursa getter kullanilir
    public String renk="Gumus";
    public String yil="2001";

     public String getRenk() {
         return renk;
     }
 }
