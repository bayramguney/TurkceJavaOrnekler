package DenemeInheritanceGercekHayatGuzelCode;

public class MySqlProductDao extends BaseProductDao {

    public MySqlProductDao(String connectionString) {

        super(connectionString);
    }

    @Override
    public void add(ProductNesnesi productNesnesi) {
        System.out.println("MySql Database : "+productNesnesi.getName()+" eklendi");
    }
}
