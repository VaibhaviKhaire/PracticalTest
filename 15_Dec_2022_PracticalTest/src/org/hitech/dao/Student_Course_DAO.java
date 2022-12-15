package org.hitech.dao;
import java.util.HashMap;
import org.hitech.model.*;
public class Student_Course_DAO {
	HashMap<Student,Course> hashMap=new HashMap<>();
	 
	public void addStudentCourseDetails(Student studentObj, Course courseObj) {
		    
	     hashMap.put(studentObj, courseObj);
	 }
	 
	public HashMap<Student,Course> getStudentCourseDetails() {
			return hashMap;
	}
	
	public void deleteStudentCourseDetails(Student studentObj) {  
		 hashMap.remove(studentObj);
	 }
}
