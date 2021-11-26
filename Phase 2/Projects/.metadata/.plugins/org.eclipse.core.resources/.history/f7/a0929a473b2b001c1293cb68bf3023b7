package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;

public class StudentDao {

	public int storeStudentRecord(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
			//Statement stmt = con.createStatement();
			//int res = stmt.executeUpdate("insert into student values(1,'Raj',21)");
			PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?)");
			pstmt.setInt(1,student.getSid());		
			pstmt.setString(2, student.getName());
			pstmt.setInt(3, student.getAge());
			int res = pstmt.executeUpdate();
			return res;			// return 1
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Student> retrieveStudentRecord() {
		List<Student> listOfStd = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
			PreparedStatement pstmt = con.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Student ss = new Student();
				ss.setSid(rs.getInt(1));				// rs.getInt("sid");
				ss.setName(rs.getString(2));
				ss.setAge(rs.getInt(3));
				listOfStd.add(ss);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return listOfStd;
	}
	
	
}
