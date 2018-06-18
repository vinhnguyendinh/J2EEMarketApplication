package entities.item.electronic;

import entities.item.electronic.Desktop;
import entities.item.electronic.ElectronicType;
import entities.item.electronic.Laptop;
import entities.item.electronic.Tablet;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(ComputerType.class)
public class ComputerType_ { 

    public static volatile SingularAttribute<ComputerType, Tablet> tablet;
    public static volatile SingularAttribute<ComputerType, Desktop> desktop;
    public static volatile SingularAttribute<ComputerType, String> name;
    public static volatile SingularAttribute<ComputerType, ElectronicType> electronicTypeID;
    public static volatile SingularAttribute<ComputerType, Integer> id;
    public static volatile SingularAttribute<ComputerType, Laptop> laptop;

}