package entities.userInfo;

import entities.order.Cart;
import entities.userInfo.Company;
import entities.userInfo.EmployeeType;
import entities.userInfo.Human;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> website;
    public static volatile SingularAttribute<Employee, Integer> employeeType;
    public static volatile CollectionAttribute<Employee, Company> companyCollection;
    public static volatile SingularAttribute<Employee, Integer> humanID;
    public static volatile SingularAttribute<Employee, Cart> cartID;
    public static volatile SingularAttribute<Employee, Integer> company;
    public static volatile SingularAttribute<Employee, String> position;
    public static volatile SingularAttribute<Employee, String> title;
    public static volatile CollectionAttribute<Employee, Human> humanCollection;
    public static volatile SingularAttribute<Employee, Human> human;
    public static volatile CollectionAttribute<Employee, EmployeeType> employeeTypeCollection;

}