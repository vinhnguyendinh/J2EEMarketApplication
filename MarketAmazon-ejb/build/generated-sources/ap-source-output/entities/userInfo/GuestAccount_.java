package entities.userInfo;

import entities.userInfo.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(GuestAccount.class)
public class GuestAccount_ { 

    public static volatile SingularAttribute<GuestAccount, Integer> accountID;
    public static volatile SingularAttribute<GuestAccount, String> guestInformation;
    public static volatile SingularAttribute<GuestAccount, Account> account;

}