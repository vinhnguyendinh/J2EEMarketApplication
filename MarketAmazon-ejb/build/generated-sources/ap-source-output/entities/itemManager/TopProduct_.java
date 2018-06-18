package entities.itemManager;

import entities.itemManager.Criteria;
import entities.itemManager.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(TopProduct.class)
public class TopProduct_ { 

    public static volatile CollectionAttribute<TopProduct, Product> productCollection;
    public static volatile SingularAttribute<TopProduct, Integer> criteria;
    public static volatile CollectionAttribute<TopProduct, Criteria> criteriaCollection;
    public static volatile SingularAttribute<TopProduct, Integer> id;
    public static volatile SingularAttribute<TopProduct, Integer> products;

}