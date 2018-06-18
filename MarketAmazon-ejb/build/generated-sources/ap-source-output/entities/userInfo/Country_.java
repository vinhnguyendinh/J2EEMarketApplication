package entities.userInfo;

import entities.userInfo.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, Integer> instance;
    public static volatile SingularAttribute<Country, String> name;
    public static volatile SingularAttribute<Country, String> description;
    public static volatile SingularAttribute<Country, Integer> id;
    public static volatile SingularAttribute<Country, Address> addressID;

}