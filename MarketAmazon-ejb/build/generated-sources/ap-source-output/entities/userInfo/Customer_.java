package entities.userInfo;

import entities.order.Cart;
import entities.userInfo.Human;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> humanID;
    public static volatile SingularAttribute<Customer, Cart> cartID;
    public static volatile SingularAttribute<Customer, String> description;
    public static volatile SingularAttribute<Customer, String> type;
    public static volatile CollectionAttribute<Customer, Human> humanCollection;
    public static volatile SingularAttribute<Customer, Human> human;

}