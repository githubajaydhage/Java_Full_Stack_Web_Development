package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Login;
public class LoginDao {

	SessionFactory sf;
	public LoginDao() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf =con.buildSessionFactory();
	}
	
	public boolean signUp(Login ll) {
		try {
			Session session  = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(ll);
			tran.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public Login signIn(Login ll) {
		Session session = sf.openSession();
		Query qry = session.createQuery("select obj from Login obj where obj.email=:a and obj.pass=:b");
		qry.setParameter("a", ll.getEmail());	// admin@gmail.com 
		qry.setParameter("b", ll.getPass());	// admin 
		List<Login> list = qry.list();
		if(list.size()>0) {
			return list.get(0);				// 
		}else {
			return null;
		}
	}
	

}
