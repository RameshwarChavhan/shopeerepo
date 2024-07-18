package com.ems;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeClient {

	public static void main(String[] args) {
	
		
		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(Employee.class);
		
		SessionFactory factory=conf.buildSessionFactory();
		Session sess=factory.openSession();
		Employee e=sess.load(Employee.class,1);
		System.out.println(e);
	}

}
