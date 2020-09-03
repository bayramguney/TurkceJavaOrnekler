package DenemeInheritanceGercekHayatGuzelCode;

public class PostSqlProductDao extends BaseProductDao {

    public PostSqlProductDao(String connectionString) {

        super(connectionString);
    }

    @Override
    public void add(ProductNesnesi productNesnesi) {
        System.out.println("PostSql Database : "+productNesnesi.getName()+" eklendi");
    }
}
