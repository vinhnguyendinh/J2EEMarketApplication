package entities.userInfo;

import entities.userInfo.Account;
import entities.userInfo.Address;
import entities.userInfo.Birthday;
import entities.userInfo.Customer;
import entities.userInfo.Employee;
import entities.userInfo.Name;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Human.class)
public class Human_ { 

    public static volatile SingularAttribute<Human, Integer> acc;
    public static volatile SingularAttribute<Human, Integer> birthday;
    public static volatile CollectionAttribute<Human, Account> accountCollection;
    public static volatile CollectionAttribute<Human, Address> addressCollection;
    public static volatile SingularAttribute<Human, Integer> address;
    public static volatile CollectionAttribute<Human, Birthday> birthdayCollection;
    public static volatile SingularAttribute<Human, Employee> employeeHumanID;
    public static volatile SingularAttribute<Human, Employee> employee;
    public static volatile SingularAttribute<Human, Customer> customerHumanID;
    public static volatile SingularAttribute<Human, Integer> name;
    public static volatile SingularAttribute<Human, Integer> id;
    public static volatile CollectionAttribute<Human, Name> nameCollection;
    public static volatile SingularAttribute<Human, Customer> customer;

}