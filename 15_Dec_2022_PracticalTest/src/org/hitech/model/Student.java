package org.hitech.model;

import java.util.Objects;

public class Student {
	int studentID;
	String studentName;
	String qualification;
	public Student() {
		
	}
	public Student(int studentID, String studentName, String qualification) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.qualification = qualification;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", qualification=" + qualification
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(qualification, studentID, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(qualification, other.qualification) && studentID == other.studentID
				&& Objects.equals(studentName, other.studentName);
	}

}
