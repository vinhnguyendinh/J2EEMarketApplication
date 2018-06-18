package entities.itemManager;

import entities.itemManager.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(SaleProduct.class)
public class SaleProduct_ { 

    public static volatile CollectionAttribute<SaleProduct, Product> productCollection;
    public static volatile SingularAttribute<SaleProduct, Integer> percentSale;
    public static volatile SingularAttribute<SaleProduct, Date> dateStart;
    public static volatile SingularAttribute<SaleProduct, Integer> id;
    public static volatile SingularAttribute<SaleProduct, Date> dateEnd;
    public static volatile SingularAttribute<SaleProduct, Integer> products;

}