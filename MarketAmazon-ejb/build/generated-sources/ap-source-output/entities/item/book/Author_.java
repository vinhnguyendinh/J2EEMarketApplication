package entities.item.book;

import entities.item.book.BookProduct;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, String> name;
    public static volatile SingularAttribute<Author, Integer> id;
    public static volatile SingularAttribute<Author, String> title;
    public static volatile SingularAttribute<Author, BookProduct> bookProductProductTypeID;

}