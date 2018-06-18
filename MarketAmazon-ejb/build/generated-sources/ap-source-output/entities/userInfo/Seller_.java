package entities.userInfo;

import entities.userInfo.EmployeeType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Seller.class)
public class Seller_ { 

    public static volatile SingularAttribute<Seller, Boolean> grantedAccess;
    public static volatile SingularAttribute<Seller, EmployeeType> employeeType;
    public static volatile SingularAttribute<Seller, Float> salary;
    public static volatile SingularAttribute<Seller, Integer> employeeTypeId;

}