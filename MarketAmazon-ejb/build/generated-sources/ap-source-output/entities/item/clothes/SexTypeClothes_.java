package entities.item.clothes;

import entities.item.clothes.ClothesProduct;
import entities.item.clothes.ManClothes;
import entities.item.clothes.WomanClothes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(SexTypeClothes.class)
public class SexTypeClothes_ { 

    public static volatile SingularAttribute<SexTypeClothes, ClothesProduct> clothesProductProductTypeID;
    public static volatile SingularAttribute<SexTypeClothes, WomanClothes> womanClothes;
    public static volatile SingularAttribute<SexTypeClothes, String> description;
    public static volatile SingularAttribute<SexTypeClothes, String> sexTypeName;
    public static volatile SingularAttribute<SexTypeClothes, Integer> id;
    public static volatile SingularAttribute<SexTypeClothes, ManClothes> manClothes;

}