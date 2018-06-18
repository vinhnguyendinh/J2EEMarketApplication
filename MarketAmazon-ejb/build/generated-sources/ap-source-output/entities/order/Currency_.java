package entities.order;

import entities.order.Payment;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Currency.class)
public class Currency_ { 

    public static volatile SingularAttribute<Currency, Payment> paymentID;
    public static volatile SingularAttribute<Currency, String> name;
    public static volatile SingularAttribute<Currency, String> description;
    public static volatile SingularAttribute<Currency, Integer> id;

}