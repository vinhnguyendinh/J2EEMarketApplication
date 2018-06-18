package entities.item.electronic;

import entities.item.electronic.ElectronicType;
import entities.itemManager.ProductType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(ElectronicProduct.class)
public class ElectronicProduct_ { 

    public static volatile SingularAttribute<ElectronicProduct, Integer> electronicType;
    public static volatile CollectionAttribute<ElectronicProduct, ElectronicType> electronicTypeCollection;
    public static volatile SingularAttribute<ElectronicProduct, String> circuitType;
    public static volatile SingularAttribute<ElectronicProduct, Integer> productTypeID;
    public static volatile SingularAttribute<ElectronicProduct, ProductType> productType;
    public static volatile SingularAttribute<ElectronicProduct, Boolean> isUsePin;

}