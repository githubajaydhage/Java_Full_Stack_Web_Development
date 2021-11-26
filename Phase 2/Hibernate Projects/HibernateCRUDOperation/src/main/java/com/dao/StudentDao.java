package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;


public class StudentDao {

	public boolean storeStudentInfo(Student student) {
		try {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();		// Like a connection 
		Session session = sf.openSession();					// Statement or PreparedStatement 
		Transaction tran = session.getTransaction();
		tran.begin();
				session.save(student);					// insert query 	
		tran.commit();
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	public int updateStudentInfo(Student student) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();		// Like a connection 
		Session session = sf.openSession();					// Statement or PreparedStatement 
		Student ss = session.find(Student.class, student.getSid());					//1st parameter reference 2nd parameter column which have pk 
		if(ss==null) {
			return 0;
		}else {
			Transaction tran = session.getTransaction();
			tran.begin();
					ss.setAge(student.getAge());
					session.update(ss);
			tran.commit();
			return 1;
		}
	}
	

	public int deleteStudentInfo(int sid) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();		// Like a connection 
		Session session = sf.openSession();					// Statement or PreparedStatement 
		Student ss = session.find(Student.class, sid);					//1st parameter reference 2nd parameter column which have pk 
		if(ss==null) {
			return 0;
		}else {
			Transaction tran = session.getTransaction();
			tran.begin();
					session.delete(ss);			// delete from student where sid = 1;
			tran.commit();
			return 1;
		}
	}
	
	public Student getStudentInfo(int sid) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();		// Like a connection 
		Session session = sf.openSession();					// Statement or PreparedStatement 
		Student ss = session.find(Student.class, sid);					//1st parameter reference 2nd parameter column which have pk 
		if(ss==null) {
			return null;
		}else {
			return ss;
		}
	}
	
	public List<Student> getAllStudents() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();		// Like a connection 
		Session session = sf.openSession();					// Statement or PreparedStatement 
		Query<Student> qry =  session.createQuery("select s from Student s");
		List<Student> listOtStudent = qry.list();
		return listOtStudent;
	}
}
