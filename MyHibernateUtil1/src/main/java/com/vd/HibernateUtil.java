package com.vd;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {
	
	public static SessionFactory getSessionFactory() {
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		SessionFactory factory = (SessionFactory) new MetadataSources(registry)
				.buildMetadata().buildSessionFactory();
		return factory;
	}
}