package entities.itemManager;

import entities.itemManager.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Preview.class)
public class Preview_ { 

    public static volatile SingularAttribute<Preview, String> image;
    public static volatile SingularAttribute<Preview, Product> productID;
    public static volatile SingularAttribute<Preview, String> intro;
    public static volatile SingularAttribute<Preview, Integer> id;

}