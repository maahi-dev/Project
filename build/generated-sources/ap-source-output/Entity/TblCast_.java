package Entity;

import Entity.TblQuestion;
import Entity.TblUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-20T11:40:56")
@StaticMetamodel(TblCast.class)
public class TblCast_ { 

    public static volatile CollectionAttribute<TblCast, TblUser> tblUserCollection;
    public static volatile SingularAttribute<TblCast, Integer> castId;
    public static volatile SingularAttribute<TblCast, String> isactive;
    public static volatile CollectionAttribute<TblCast, TblQuestion> tblQuestionCollection;
    public static volatile SingularAttribute<TblCast, String> castName;

}