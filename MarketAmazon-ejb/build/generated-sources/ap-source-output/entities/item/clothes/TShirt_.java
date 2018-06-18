package entities.item.clothes;

import entities.item.clothes.ManClothesType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(TShirt.class)
public class TShirt_ { 

    public static volatile SingularAttribute<TShirt, String> name;
    public static volatile SingularAttribute<TShirt, String> description;
    public static volatile SingularAttribute<TShirt, ManClothesType> manClothesType;
    public static volatile SingularAttribute<TShirt, Integer> manClothesTypeID;

}