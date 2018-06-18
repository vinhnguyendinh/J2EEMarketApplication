package entities.itemManager;

import entities.itemManager.Comment;
import entities.itemManager.Manufacturer;
import entities.itemManager.Preview;
import entities.itemManager.PriceList;
import entities.itemManager.ProductType;
import entities.itemManager.SaleProduct;
import entities.itemManager.TopProduct;
import entities.order.Cart;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> preview;
    public static volatile SingularAttribute<Product, SaleProduct> saleProductID;
    public static volatile SingularAttribute<Product, Float> cost;
    public static volatile CollectionAttribute<Product, Manufacturer> manufacturerCollection;
    public static volatile SingularAttribute<Product, Cart> cartID;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, PriceList> priceListID;
    public static volatile SingularAttribute<Product, Integer> manufacturer;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile CollectionAttribute<Product, ProductType> productTypeCollection;
    public static volatile SingularAttribute<Product, Comment> commentID;
    public static volatile CollectionAttribute<Product, Preview> previewCollection;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, Integer> productType;
    public static volatile SingularAttribute<Product, TopProduct> topProductID;

}