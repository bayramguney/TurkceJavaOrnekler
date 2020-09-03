package DenemeString;

public class StringSinifi {

    public static void main(java.lang.String[] args) {
        String a = "Mustafa";
        String b = new java.lang.String("Mustafa");

        System.out.println("Harf sayisi : "+b.length());
        System.out.println(("0. index : "+b.charAt(0)));
        System.out.println("son eleman : "+b.charAt(b.length()-1));

        for (int i = 0; i <b.length() ; i++) {
            System.out.println(b.charAt(i)); }

        System.out.println(b.startsWith("Mus"));
        System.out.println(b.endsWith("fa"));

        System.out.println(b.indexOf("a"));
        System.out.println(b.lastIndexOf("a"));

        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());

        String d="1923";
        int d1=Integer.parseInt(d);

        int e=1923;
        String e1=""+1923;
        String e2= java.lang.String.valueOf(e);




    }
}