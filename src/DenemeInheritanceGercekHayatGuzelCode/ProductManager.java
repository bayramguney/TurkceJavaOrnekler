package DenemeInheritanceGercekHayatGuzelCode;

import DenemeInheritanceGercekHayatGuzelCode.ProductNesnesi;

public class ProductManager {
    private BaseProductDao baseProductDao;


    public ProductManager(BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }

    public void add(ProductNesnesi productNesnesi) {
        baseProductDao.add(productNesnesi);


        System.out.println("Urun is katmani islemleri : ");
        System.out.println("Urun ismi " + productNesnesi.getName());
    }
}