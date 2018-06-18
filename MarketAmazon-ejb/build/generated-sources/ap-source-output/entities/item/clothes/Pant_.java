package entities.item.clothes;

import entities.item.clothes.ManClothesType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Pant.class)
public class Pant_ { 

    public static volatile SingularAttribute<Pant, String> name;
    public static volatile SingularAttribute<Pant, String> description;
    public static volatile SingularAttribute<Pant, ManClothesType> manClothesType;
    public static volatile SingularAttribute<Pant, Integer> manClothesTypeID;

}