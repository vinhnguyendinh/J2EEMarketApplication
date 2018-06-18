package entities.order;

import entities.order.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile SingularAttribute<Cart, Order1> orderID;
    public static volatile SingularAttribute<Cart, Integer> id;
    public static volatile SingularAttribute<Cart, Integer> employee;
    public static volatile SingularAttribute<Cart, Float> totalCost;
    public static volatile SingularAttribute<Cart, Integer> products;
    public static volatile SingularAttribute<Cart, Integer> customer;

}