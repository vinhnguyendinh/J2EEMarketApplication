package entities.item.clothes;

import entities.item.clothes.Color;
import entities.item.clothes.SexTypeClothes;
import entities.item.clothes.TypeClothes;
import entities.itemManager.ProductType;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(ClothesProduct.class)
public class ClothesProduct_ { 

    public static volatile SingularAttribute<ClothesProduct, Integer> typeClothes;
    public static volatile CollectionAttribute<ClothesProduct, Color> colorCollection;
    public static volatile CollectionAttribute<ClothesProduct, TypeClothes> typeClothesCollection;
    public static volatile SingularAttribute<ClothesProduct, Integer> color;
    public static volatile CollectionAttribute<ClothesProduct, SexTypeClothes> sexTypeClothesCollection;
    public static volatile SingularAttribute<ClothesProduct, Integer> sexTypeClothes;
    public static volatile SingularAttribute<ClothesProduct, Integer> productTypeID;
    public static volatile SingularAttribute<ClothesProduct, ProductType> productType;

}