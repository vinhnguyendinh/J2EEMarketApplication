package entities.userInfo;

import entities.userInfo.Human;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-19T23:10:35")
@StaticMetamodel(Birthday.class)
public class Birthday_ { 

    public static volatile SingularAttribute<Birthday, String> month;
    public static volatile SingularAttribute<Birthday, Human> humanID;
    public static volatile SingularAttribute<Birthday, Integer> year;
    public static volatile SingularAttribute<Birthday, Integer> id;
    public static volatile SingularAttribute<Birthday, Integer> day;

}