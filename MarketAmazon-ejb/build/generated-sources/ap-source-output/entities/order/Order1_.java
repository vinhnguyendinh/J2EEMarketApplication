package entities.order;

import entities.order.Bill;
import entities.order.Cart;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile CollectionAttribute<Order1, Cart> cartCollection;
    public static volatile SingularAttribute<Order1, String> receiveAddress;
    public static volatile SingularAttribute<Order1, Bill> billID;
    public static volatile SingularAttribute<Order1, Integer> id;
    public static volatile SingularAttribute<Order1, String> time;
    public static volatile SingularAttribute<Order1, Integer> cart;

}