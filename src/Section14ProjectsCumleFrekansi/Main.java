package Section14ProjectsCumleFrekansi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Cumleyi giriniz : ");
        String cumle=scanner.nextLine();
        Map<Character,Integer>freakans=new TreeMap<>();
        for (int i = 0; i <cumle.length() ; i++) {
            char c=cumle.charAt(i);
            if(freakans.containsKey(c)){
                freakans.replace(c,freakans.get(c)+1);
            }else{
                freakans.put(c,1);
            }

        }

        for (Map.Entry<Character,Integer> entry:freakans.entrySet()) {
            System.out.println("Karakter : " + entry.getKey() + " "+entry.getValue()+ " kadar geciyor...");


        }
    }
}
