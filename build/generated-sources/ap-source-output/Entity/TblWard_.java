package Entity;

import Entity.TblQuestion;
import Entity.TblUser;
import Entity.TblZone;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-20T11:40:56")
@StaticMetamodel(TblWard.class)
public class TblWard_ { 

    public static volatile SingularAttribute<TblWard, String> wardName;
    public static volatile CollectionAttribute<TblWard, TblUser> tblUserCollection;
    public static volatile SingularAttribute<TblWard, String> isactive;
    public static volatile SingularAttribute<TblWard, TblZone> zoneId;
    public static volatile SingularAttribute<TblWard, Integer> wardId;
    public static volatile CollectionAttribute<TblWard, TblQuestion> tblQuestionCollection;

}