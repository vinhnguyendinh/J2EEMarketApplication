package entities.userInfo;

import entities.userInfo.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile SingularAttribute<Company, String> name;
    public static volatile SingularAttribute<Company, Employee> employeeHumanID;
    public static volatile SingularAttribute<Company, Integer> id;
    public static volatile SingularAttribute<Company, Integer> staffNumber;
    public static volatile SingularAttribute<Company, String> url;

}