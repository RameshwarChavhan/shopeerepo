package com.ems;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeCrud {

	public static void main(String[] args) {
		
		
		Configuration conf=new Configuration();
		conf.configure();
		conf.addAnnotatedClass(Employee.class);
		
		SessionFactory factory=conf.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction t=sess.beginTransaction();
		Employee e=new Employee(167,"Ravi",8345);
		
		sess.save(e);
		
		Employee emp=new Employee(165,"KRK",78654);
		
		sess.update(emp);
		
		t.commit();
		//Employee e=sess.load(Employee.class,1);
		//System.out.println(e);
	}

}
