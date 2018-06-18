package entities.userInfo;

import entities.userInfo.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(SMemberAccount.class)
public class SMemberAccount_ { 

    public static volatile SingularAttribute<SMemberAccount, Integer> accountID;
    public static volatile SingularAttribute<SMemberAccount, String> sMemberInformation;
    public static volatile SingularAttribute<SMemberAccount, Float> saleOffPercent;
    public static volatile SingularAttribute<SMemberAccount, Account> account;

}