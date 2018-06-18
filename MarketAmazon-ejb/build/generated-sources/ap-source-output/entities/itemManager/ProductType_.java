package entities.itemManager;

import entities.item.electronic.ElectronicProduct;
import entities.itemManager.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(ProductType.class)
public class ProductType_ { 

    public static volatile SingularAttribute<ProductType, ElectronicProduct> electronicProduct;
    public static volatile SingularAttribute<ProductType, String> nameType;
    public static volatile SingularAttribute<ProductType, Product> productID;
    public static volatile SingularAttribute<ProductType, String> description;
    public static volatile SingularAttribute<ProductType, Integer> id;
    public static volatile SingularAttribute<ProductType, Integer> type;

}