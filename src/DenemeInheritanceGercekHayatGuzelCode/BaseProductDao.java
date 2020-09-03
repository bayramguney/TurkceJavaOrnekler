package DenemeInheritanceGercekHayatGuzelCode;

public class BaseProductDao {
    private String connectionString;

    public BaseProductDao(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    public void add(ProductNesnesi productNesnesi){
        System.out.println("Default Database : "+productNesnesi.getName()+" eklendi .");
    }
}
