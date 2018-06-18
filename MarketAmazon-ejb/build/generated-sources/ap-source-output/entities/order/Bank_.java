package entities.order;

import entities.order.Payment;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Bank.class)
public class Bank_ { 

    public static volatile SingularAttribute<Bank, Payment> paymentID;
    public static volatile SingularAttribute<Bank, String> name;
    public static volatile SingularAttribute<Bank, String> description;
    public static volatile SingularAttribute<Bank, Integer> id;

}