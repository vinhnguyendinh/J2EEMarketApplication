package entities.userInfo;

import entities.userInfo.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(VIPAccount.class)
public class VIPAccount_ { 

    public static volatile SingularAttribute<VIPAccount, Integer> accountID;
    public static volatile SingularAttribute<VIPAccount, String> vipInformation;
    public static volatile SingularAttribute<VIPAccount, Account> account;
    public static volatile SingularAttribute<VIPAccount, String> ruleVip;

}