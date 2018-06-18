package entities.userInfo;

import entities.userInfo.Admin;
import entities.userInfo.Employee;
import entities.userInfo.Manager;
import entities.userInfo.Seller;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(EmployeeType.class)
public class EmployeeType_ { 

    public static volatile SingularAttribute<EmployeeType, Seller> seller;
    public static volatile SingularAttribute<EmployeeType, Manager> manager;
    public static volatile SingularAttribute<EmployeeType, String> description;
    public static volatile SingularAttribute<EmployeeType, Admin> admin;
    public static volatile SingularAttribute<EmployeeType, Employee> employeeHumanID;
    public static volatile SingularAttribute<EmployeeType, Integer> id;

}