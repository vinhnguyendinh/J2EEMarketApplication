package entities.userInfo;

import entities.itemManager.Comment;
import entities.userInfo.GuestAccount;
import entities.userInfo.Human;
import entities.userInfo.MemberAccount;
import entities.userInfo.SMemberAccount;
import entities.userInfo.VIPAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, SMemberAccount> sMemberAccount;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, Human> humanID;
    public static volatile SingularAttribute<Account, VIPAccount> vIPAccount;
    public static volatile SingularAttribute<Account, Comment> commentID;
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, MemberAccount> memberAccount;
    public static volatile SingularAttribute<Account, GuestAccount> guestAccount;
    public static volatile SingularAttribute<Account, String> username;

}