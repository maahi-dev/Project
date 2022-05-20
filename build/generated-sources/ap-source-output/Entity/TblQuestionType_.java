package Entity;

import Entity.TblQuestion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-05-20T11:40:56")
@StaticMetamodel(TblQuestionType.class)
public class TblQuestionType_ { 

    public static volatile SingularAttribute<TblQuestionType, String> isactive;
    public static volatile SingularAttribute<TblQuestionType, String> typeName;
    public static volatile SingularAttribute<TblQuestionType, Integer> questionTypeId;
    public static volatile CollectionAttribute<TblQuestionType, TblQuestion> tblQuestionCollection;

}