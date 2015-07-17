package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Company.class)
public abstract class Company_ {

	public static volatile SingularAttribute<Company, Integer> id;
	public static volatile SingularAttribute<Company, String> phone;
	public static volatile SingularAttribute<Company, Integer> employeesQty;
	public static volatile SingularAttribute<Company, String> email;
	public static volatile SingularAttribute<Company, String> webSite;
	public static volatile SingularAttribute<Company, String> description;
	public static volatile SingularAttribute<Company, Date> dateOfEstablishment;
	public static volatile SingularAttribute<Company, String> name;

}

