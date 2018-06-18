package entities.item.clothes;

import entities.item.clothes.Dress;
import entities.item.clothes.JeansWoman;
import entities.item.clothes.WomanClothes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(WomenClothesType.class)
public class WomenClothesType_ { 

    public static volatile SingularAttribute<WomenClothesType, Dress> dress;
    public static volatile SingularAttribute<WomenClothesType, WomanClothes> womanClothesSexTypeClothesID;
    public static volatile SingularAttribute<WomenClothesType, JeansWoman> jeansWoman;
    public static volatile SingularAttribute<WomenClothesType, String> description;
    public static volatile SingularAttribute<WomenClothesType, Integer> id;

}