package entities.item.book;

import entities.item.book.BookProduct;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Publisher.class)
public class Publisher_ { 

    public static volatile SingularAttribute<Publisher, String> name;
    public static volatile SingularAttribute<Publisher, String> description;
    public static volatile SingularAttribute<Publisher, Integer> id;
    public static volatile SingularAttribute<Publisher, BookProduct> bookProductProductTypeID;

}