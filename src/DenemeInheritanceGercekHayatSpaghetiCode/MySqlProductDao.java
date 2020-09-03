package DenemeInheritanceGercekHayatSpaghetiCode;

public class MySqlProductDao {
    private String connectionString;

    public MySqlProductDao(String connectionString) {
        this.connectionString = connectionString;
    }

    public void add(ProductNesnesi productNesnesi){
        System.out.println("Oracle database  "+productNesnesi.getName()+ " nesnesi eklendi ");
    }
}
