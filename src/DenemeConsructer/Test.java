package DenemeConsructer;

public class Test {
    public static void main(String[] args) {
        Account account1=new Account("mustafa","mus@yahoo.com","34567843");
        Account account2=account1;
        if(account1==account2){
            System.out.println("ayni"); }

    }
}
