package entities.userInfo;

import entities.userInfo.City;
import entities.userInfo.Country;
import entities.userInfo.Human;
import entities.userInfo.Street;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, Integer> country;
    public static volatile SingularAttribute<Address, String> number;
    public static volatile SingularAttribute<Address, Human> humanID;
    public static volatile SingularAttribute<Address, Integer> city;
    public static volatile SingularAttribute<Address, Integer> street;
    public static volatile CollectionAttribute<Address, Street> streetCollection;
    public static volatile CollectionAttribute<Address, City> cityCollection;
    public static volatile CollectionAttribute<Address, Country> countryCollection;
    public static volatile SingularAttribute<Address, Integer> id;

}