package entities.itemManager;

import entities.itemManager.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(PriceList.class)
public class PriceList_ { 

    public static volatile SingularAttribute<PriceList, Integer> instance;
    public static volatile CollectionAttribute<PriceList, Product> productCollection;
    public static volatile SingularAttribute<PriceList, String> updateTime;
    public static volatile SingularAttribute<PriceList, Integer> id;
    public static volatile SingularAttribute<PriceList, Integer> products;

}