package entities.userInfo;

import entities.userInfo.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(MemberAccount.class)
public class MemberAccount_ { 

    public static volatile SingularAttribute<MemberAccount, Integer> accountID;
    public static volatile SingularAttribute<MemberAccount, String> memberInformation;
    public static volatile SingularAttribute<MemberAccount, Integer> attribute;
    public static volatile SingularAttribute<MemberAccount, Account> account;

}