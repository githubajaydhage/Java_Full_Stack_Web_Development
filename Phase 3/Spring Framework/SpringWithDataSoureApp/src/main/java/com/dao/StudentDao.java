package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Student;

@Repository						// This is Dao layer specific annotation 
public class StudentDao {

	// Using DataSource 
//	@Autowired
//	DataSource ds;				// before spring framework, look up from application server using JDNI 
//	
//	public int storeStudentRecord(Student std) {
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?,?)");
//			pstmt.setInt(1, std.getSid());
//			pstmt.setString(2, std.getName());
//			pstmt.setInt(3, std.getAge());
//			pstmt.setInt(4, 111);
//			return pstmt.executeUpdate();
//		} catch (Exception e) {
//		System.out.println(e);
//		return 0;
//		}
//	}
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeStudentRecord(Student std) { 
		try {
			// executeUpdate() : using this we can insert, delete and update 
		//return jdbcTemplate.update("insert into student values(?,?,?,?)", new Object[] {std.getSid(),std.getName(),std.getAge(),2222});
			return jdbcTemplate.update("insert into student values(?,?,?,?)", std.getSid(),std.getName(),std.getAge(),222);
		}catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public List<Map<String, Object>> retrieveStudentInfo() {	// key column name and value : column values. value can be any type 
																									// object type
		try {
			return jdbcTemplate.queryForList("select * from student");
		}catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	
	public List<Map<String, Object>> retrieveStudentInfoWithCourse(String cname) {	// key column name and value : column values. value can be any type 
		// object type
			try {
				//jdbcTemplate.queryForLI
return jdbcTemplate.queryForList("select s.name,s.age,c.cname from student s inner join course c on s.scid=c.cid and c.cname = ?",cname);
				}catch (Exception e) {
						System.out.println(e);
					}
			return null;
	}
	
}
