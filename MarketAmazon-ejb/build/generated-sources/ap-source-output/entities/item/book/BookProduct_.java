package entities.item.book;

import entities.item.book.Author;
import entities.item.book.Category;
import entities.item.book.Publisher;
import entities.itemManager.ProductType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(BookProduct.class)
public class BookProduct_ { 

    public static volatile CollectionAttribute<BookProduct, Category> categoryCollection;
    public static volatile CollectionAttribute<BookProduct, Author> authorCollection;
    public static volatile SingularAttribute<BookProduct, Integer> author;
    public static volatile SingularAttribute<BookProduct, String> name;
    public static volatile SingularAttribute<BookProduct, ProductType> productType1;
    public static volatile SingularAttribute<BookProduct, Integer> publisher;
    public static volatile SingularAttribute<BookProduct, Integer> category;
    public static volatile CollectionAttribute<BookProduct, Publisher> publisherCollection;
    public static volatile SingularAttribute<BookProduct, Integer> productType;
    public static volatile SingularAttribute<BookProduct, String> content;
    public static volatile SingularAttribute<BookProduct, Integer> productTypeID;

}