package entities.userInfo;

import entities.userInfo.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Street.class)
public class Street_ { 

    public static volatile SingularAttribute<Street, String> name;
    public static volatile SingularAttribute<Street, String> description;
    public static volatile SingularAttribute<Street, Integer> id;
    public static volatile SingularAttribute<Street, Address> addressID;

}