package com.assignment;



import com.assignment.dao.StudentDao;
import com.assignment.model.Student;

public class App
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // insert values
        Student student = new Student("vaibhavi", "khaire", "vaibhavikhire07@gmail.com");
        Student student1 = new Student("sumera", "attar", "sumeraattar18@gmail.com");
        Student student2 = new Student("mansi", "Chavan", "mansichavan19@gmail.com");

        //save values
        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);


        studentDao.getStudent(1);
        studentDao.loadStudent(2);
       
    }
 }