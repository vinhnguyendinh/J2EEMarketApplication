package entities.item.clothes;

import entities.item.clothes.ManClothes;
import entities.item.clothes.Pant;
import entities.item.clothes.TShirt;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(ManClothesType.class)
public class ManClothesType_ { 

    public static volatile SingularAttribute<ManClothesType, Pant> pant;
    public static volatile SingularAttribute<ManClothesType, TShirt> tShirt;
    public static volatile SingularAttribute<ManClothesType, ManClothes> manClothesSexTypeClothesID;
    public static volatile SingularAttribute<ManClothesType, String> description;
    public static volatile SingularAttribute<ManClothesType, Integer> id;

}