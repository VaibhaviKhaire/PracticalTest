package com.assignment.dao;


	

	

	import org.hibernate.Session;
import org.hibernate.Transaction;

import com.assignment.model.Student;
	import com.assignment.util.HibernateUtil;

	public class StudentDao{

		// save Student
	    // get All Students
	    // get Student By Id
	    // Update Student
	    // Delete Student
		public void getStudent(int id) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession())
	        {
	            // start a transaction
	            transaction = session.beginTransaction();



	            // get Student entity using get() method
	            Student student = session.get(Student.class, id);
	            System.out.println(student.getFirstName());
	            System.out.println(student.getEmail());



	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }



	    public void loadStudent(int id) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession())
	        {
	            // start a transaction
	            transaction = session.beginTransaction();



	            // get Student entity using load() method
	            Student student = session.load(Student.class, id);
	            System.out.println(student.getFirstName());
	            System.out.println(student.getEmail());



	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }



	    public void getEmployeeById(int id) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();



	            // Obtain an entity using byId() method
	            Student student = session.byId(Student.class).getReference(id);
	            System.out.println(student.getFirstName());
	            System.out.println(student.getEmail());



	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    public void saveStudent(Student student) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession())
	        {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(student);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null)
	            {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }
	}

