package DenemeInheritanceGercekHayatSpaghetiCode;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        productManager.add(new ProductNesnesi(1,"Su",2),2);
    }
}