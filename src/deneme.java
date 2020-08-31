import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

       int i=0;
       while(i<10){
if(i==3 || i==5){
    continue;
}
           System.out.println(i);
           i++;
       }


    }

}

