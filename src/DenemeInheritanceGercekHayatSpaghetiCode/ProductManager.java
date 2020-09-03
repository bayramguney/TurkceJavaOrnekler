package DenemeInheritanceGercekHayatSpaghetiCode;

public class ProductManager {
    public void add(ProductNesnesi productNesnesi, int databaseType) {
        if (databaseType == 1) {
            MySqlProductDao mysqlProductDao = new MySqlProductDao("MySqltring");
            mysqlProductDao.add(productNesnesi);


        } else if (databaseType == 2) {
            OracleProductDao oracleProductDao = new OracleProductDao("OracleString");
            oracleProductDao.add(productNesnesi);

        }
        System.out.println("Urun is katmani islemleri : ");
        System.out.println("Urun ismi " + productNesnesi.getName());
    }
}