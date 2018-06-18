package entities.item.clothes;

import entities.item.clothes.SexTypeClothes;
import entities.item.clothes.WomenClothesType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(WomanClothes.class)
public class WomanClothes_ { 

    public static volatile SingularAttribute<WomanClothes, Integer> sexTypeClothesID;
    public static volatile CollectionAttribute<WomanClothes, WomenClothesType> womenClothesTypeCollection;
    public static volatile SingularAttribute<WomanClothes, String> size;
    public static volatile SingularAttribute<WomanClothes, String> name;
    public static volatile SingularAttribute<WomanClothes, SexTypeClothes> sexTypeClothes;
    public static volatile SingularAttribute<WomanClothes, Integer> womenClothesType;

}