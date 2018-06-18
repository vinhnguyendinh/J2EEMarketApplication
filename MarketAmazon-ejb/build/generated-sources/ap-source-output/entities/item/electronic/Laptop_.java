package entities.item.electronic;

import entities.item.electronic.ComputerType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Laptop.class)
public class Laptop_ { 

    public static volatile SingularAttribute<Laptop, ComputerType> computerType;
    public static volatile SingularAttribute<Laptop, String> description;
    public static volatile SingularAttribute<Laptop, Boolean> isTouch;
    public static volatile SingularAttribute<Laptop, Integer> computerTypeID;

}