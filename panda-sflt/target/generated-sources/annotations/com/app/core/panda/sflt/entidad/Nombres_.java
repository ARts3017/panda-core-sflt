package com.app.core.panda.sflt.entidad;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Nombres.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Nombres_ {

	public static final String APELLIDO_PATERNO = "apellidoPaterno";
	public static final String ID = "id";
	public static final String NOMBRE = "nombre";

	
	/**
	 * @see com.app.core.panda.sflt.entidad.Nombres#apellidoPaterno
	 **/
	public static volatile SingularAttribute<Nombres, String> apellidoPaterno;
	
	/**
	 * @see com.app.core.panda.sflt.entidad.Nombres#id
	 **/
	public static volatile SingularAttribute<Nombres, Integer> id;
	
	/**
	 * @see com.app.core.panda.sflt.entidad.Nombres
	 **/
	public static volatile EntityType<Nombres> class_;
	
	/**
	 * @see com.app.core.panda.sflt.entidad.Nombres#nombre
	 **/
	public static volatile SingularAttribute<Nombres, String> nombre;

}

