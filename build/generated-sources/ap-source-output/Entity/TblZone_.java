package Entity;

import Entity.TblQuestion;
import Entity.TblVillage;
import Entity.TblWard;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-20T11:40:56")
@StaticMetamodel(TblZone.class)
public class TblZone_ { 

    public static volatile CollectionAttribute<TblZone, TblWard> tblWardCollection;
    public static volatile SingularAttribute<TblZone, String> isactive;
    public static volatile SingularAttribute<TblZone, Integer> zoneId;
    public static volatile SingularAttribute<TblZone, String> zoneName;
    public static volatile SingularAttribute<TblZone, TblVillage> villageId;
    public static volatile CollectionAttribute<TblZone, TblQuestion> tblQuestionCollection;

}