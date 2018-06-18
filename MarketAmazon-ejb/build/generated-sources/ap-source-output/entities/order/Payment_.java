package entities.order;

import entities.order.Bank;
import entities.order.Bill;
import entities.order.Currency;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, String> cartNumber;
    public static volatile SingularAttribute<Payment, Integer> bank;
    public static volatile CollectionAttribute<Payment, Bank> bankCollection;
    public static volatile SingularAttribute<Payment, Bill> billID;
    public static volatile CollectionAttribute<Payment, Currency> currencyCollection;
    public static volatile SingularAttribute<Payment, Integer> currency;
    public static volatile SingularAttribute<Payment, Integer> id;
    public static volatile SingularAttribute<Payment, String> cartName;

}