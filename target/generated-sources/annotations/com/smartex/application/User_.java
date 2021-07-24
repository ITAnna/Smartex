package com.smartex.application;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> surname;
	public static volatile SingularAttribute<User, Long> roleId;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, String> login;
	public static volatile SingularAttribute<User, String> email;

	public static final String PASSWORD = "password";
	public static final String SURNAME = "surname";
	public static final String ROLE_ID = "roleId";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String LOGIN = "login";
	public static final String EMAIL = "email";

}

