package Entity;

import Entity.TblQuestion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-20T11:40:56")
@StaticMetamodel(TblOccupation.class)
public class TblOccupation_ { 

    public static volatile SingularAttribute<TblOccupation, Integer> occupationId;
    public static volatile SingularAttribute<TblOccupation, String> occupationName;
    public static volatile SingularAttribute<TblOccupation, String> isactive;
    public static volatile CollectionAttribute<TblOccupation, TblQuestion> tblQuestionCollection;

}