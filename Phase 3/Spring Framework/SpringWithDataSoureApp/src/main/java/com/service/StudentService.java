package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Student;
import com.dao.StudentDao;

@Service								// service layer annotation 
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public String storeStudentInfo(Student std) {
		if(studentDao.storeStudentRecord(std)>0) {
			return "Stored";
		}else {
			return "Didn't store";
		}
	}
	
	public List<Map<String, Object>> getAllStudentInfo() {
		return studentDao.retrieveStudentInfo();
	}
	
	public List<Map<String, Object>> getStudentAndCourseInfo(String cname) {
		return studentDao.retrieveStudentInfoWithCourse(cname);
	}
	
}
