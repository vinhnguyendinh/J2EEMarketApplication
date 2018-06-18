package entities.item.clothes;

import entities.item.clothes.WomenClothesType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Dress.class)
public class Dress_ { 

    public static volatile SingularAttribute<Dress, String> name;
    public static volatile SingularAttribute<Dress, String> description;
    public static volatile SingularAttribute<Dress, WomenClothesType> womenClothesType;
    public static volatile SingularAttribute<Dress, Integer> womenClothesTypeID;

}