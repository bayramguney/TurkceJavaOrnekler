package DenemeInheritanceGercekHayatGuzelCode;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager(new PostSqlProductDao("MySql String"));
        productManager.add(new ProductNesnesi(2,"Cikolata",5));
    }
}
