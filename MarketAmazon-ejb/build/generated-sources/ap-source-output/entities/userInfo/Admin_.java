package entities.userInfo;

import entities.userInfo.EmployeeType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, EmployeeType> employeeType;
    public static volatile SingularAttribute<Admin, String> adminRule;
    public static volatile SingularAttribute<Admin, String> raw;
    public static volatile SingularAttribute<Admin, Integer> employeeTypeId;

}