package org.hitech.model;

import java.util.Objects;

public class Course {
int courseID;
String courseName;
double price;
public Course() {
	
}
public Course(int courseID, String courseName, double price) {
	super();
	this.courseID = courseID;
	this.courseName = courseName;
	this.price = price;
}
public int getCourseID() {
	return courseID;
}
public void setCourseID(int courseID) {
	this.courseID = courseID;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Course [courseID=" + courseID + ", courseName=" + courseName + ", price=" + price + "]";
}
@Override
public int hashCode() {
	return Objects.hash(courseID, courseName, price);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Course other = (Course) obj;
	return courseID == other.courseID && Objects.equals(courseName, other.courseName)
			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
}

}
