package entities.userInfo;

import entities.userInfo.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, String> name;
    public static volatile SingularAttribute<City, String> description;
    public static volatile SingularAttribute<City, Integer> id;
    public static volatile SingularAttribute<City, Address> addressID;

}