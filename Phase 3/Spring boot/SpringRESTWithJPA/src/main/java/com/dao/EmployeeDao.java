package com.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Employee;
@Repository
public class EmployeeDao {
	@Autowired
	EntityManagerFactory emf;		//like a SessionFactory EntityManager di happen from application.properties file. 
	
	public List<Employee> getAllEmployee() {
		// EntityManager is like a session 
		EntityManager manager = emf.createEntityManager();
		// JPQL Java Persistence Query Language 
		Query qry = manager.createQuery("select emp from Employee emp");
		List<Employee> list = qry.getResultList();
		return list;
	}
	
	public boolean storeEmployeeRecord(Employee emp) {
		try {
			// it is like a session 
		EntityManager manager = emf.createEntityManager();
		// it is like Transaction in Hibernate 
		EntityTransaction tran =  manager.getTransaction();
		tran.begin();
			manager.persist(emp);      // like a save method 
		tran.commit();
		return true;
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public int updateEmployeeRecord(Employee emp) {
		EntityManager manager = emf.createEntityManager();
		Employee e = manager.find(Employee.class, emp.getId());	// find is like a get in hibernate 
		if(e==null) {
			return 0;
		}else {
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
			e.setSalary(emp.getSalary());
			manager.merge(e);                     // This method is like a update in hibernate 
			tran.commit();
			return 1;
		}
	}
	
	public int deleteEmployeeRecord(int id) {
		EntityManager manager = emf.createEntityManager();
		Employee e  = manager.find(Employee.class, id);
		if(e==null) {
			return 0;
		}else {
			EntityTransaction tran  = manager.getTransaction();
			tran.begin();
				manager.remove(e);     // in Hibernate Delete method 
			tran.commit();
			return 1;
		}
	}
	
	public Employee findEmployeeUsingId(int id) {
		EntityManager manager = emf.createEntityManager();
		Employee e  = manager.find(Employee.class, id);
		return e;
	}
	
}
