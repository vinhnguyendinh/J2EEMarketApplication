package entities.item.clothes;

import entities.item.clothes.ManClothesType;
import entities.item.clothes.SexTypeClothes;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(ManClothes.class)
public class ManClothes_ { 

    public static volatile SingularAttribute<ManClothes, Integer> sexTypeClothesID;
    public static volatile SingularAttribute<ManClothes, String> size;
    public static volatile CollectionAttribute<ManClothes, ManClothesType> manClothesTypeCollection;
    public static volatile SingularAttribute<ManClothes, String> name;
    public static volatile SingularAttribute<ManClothes, SexTypeClothes> sexTypeClothes;
    public static volatile SingularAttribute<ManClothes, Integer> manClothesType;

}