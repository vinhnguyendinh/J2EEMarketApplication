package entities.order;

import entities.order.Order1;
import entities.order.Payment;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Bill.class)
public class Bill_ { 

    public static volatile CollectionAttribute<Bill, Order1> order1Collection;
    public static volatile SingularAttribute<Bill, Integer> id;
    public static volatile CollectionAttribute<Bill, Payment> paymentCollection;
    public static volatile SingularAttribute<Bill, Integer> paymant;
    public static volatile SingularAttribute<Bill, Integer> order;

}