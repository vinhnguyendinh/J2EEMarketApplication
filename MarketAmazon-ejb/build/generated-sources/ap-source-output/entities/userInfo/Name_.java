package entities.userInfo;

import entities.userInfo.Human;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Name.class)
public class Name_ { 

    public static volatile SingularAttribute<Name, String> firstName;
    public static volatile SingularAttribute<Name, String> lastName;
    public static volatile SingularAttribute<Name, Human> humanID;
    public static volatile SingularAttribute<Name, String> middleName;
    public static volatile SingularAttribute<Name, Integer> id;

}