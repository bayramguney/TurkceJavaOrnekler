package DenemeInheritanceGercekHayatSpaghetiCode;

public class OracleProductDao {
    private String connectionString;

    public OracleProductDao(String connectionString) {
        this.connectionString = connectionString;
    }

    public void add(ProductNesnesi productNesnesi){
        System.out.println("Oracle database  "+productNesnesi.getName()+ " nesnesi eklendi ");
    }
}
