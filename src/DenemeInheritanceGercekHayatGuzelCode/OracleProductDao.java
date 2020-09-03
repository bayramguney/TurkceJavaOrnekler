package DenemeInheritanceGercekHayatGuzelCode;

public class OracleProductDao extends BaseProductDao {

    public OracleProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(ProductNesnesi productNesnesi) {
        System.out.println("Oracle Database : "+productNesnesi.getName()+" eklendi");
    }
}
