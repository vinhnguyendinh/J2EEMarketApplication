package entities.item.electronic;

import entities.item.electronic.ComputerType;
import entities.item.electronic.ElectronicProduct;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(ElectronicType.class)
public class ElectronicType_ { 

    public static volatile CollectionAttribute<ElectronicType, ComputerType> computerTypeCollection;
    public static volatile SingularAttribute<ElectronicType, Integer> computerType;
    public static volatile SingularAttribute<ElectronicType, String> screenSize;
    public static volatile SingularAttribute<ElectronicType, String> name;
    public static volatile SingularAttribute<ElectronicType, String> typeKeyboard;
    public static volatile SingularAttribute<ElectronicType, String> description;
    public static volatile SingularAttribute<ElectronicType, String> cpu;
    public static volatile SingularAttribute<ElectronicType, Boolean> isTouch;
    public static volatile SingularAttribute<ElectronicType, Integer> id;
    public static volatile SingularAttribute<ElectronicType, ElectronicProduct> electronicProductProductTypeID;
    public static volatile SingularAttribute<ElectronicType, String> discriminator;

}