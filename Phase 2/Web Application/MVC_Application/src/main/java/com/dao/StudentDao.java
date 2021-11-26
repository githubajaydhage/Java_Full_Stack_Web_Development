package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;



public class StudentDao {

	SessionFactory sf;
	
	public StudentDao() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf =con.buildSessionFactory();
	}

	public boolean storeStudentRecord(Student ss) {
		try {
			Session session  = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(ss);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public List<Student> getAllStudentInfo() {
		Session session  = sf.openSession();
		Query qry = session.createQuery("select s from Student s");
		List<Student> listOfStd = qry.list();
		return listOfStd;
	}
}
