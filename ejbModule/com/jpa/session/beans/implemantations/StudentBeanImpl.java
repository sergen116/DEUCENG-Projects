package com.jpa.session.beans.implemantations;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import com.jpa.entities.Student;
import com.jpa.session.beans.interfaces.StudentBean;

/**
 * Session Bean implementation class StudentBeanImpl
 */
@Stateless
public class StudentBeanImpl implements StudentBean {

	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public StudentBeanImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Student findStudentAccordingToFullName(String firstname,
			String lastname) {
		Student student = null;
		
		try {
			return em.createQuery("SELECT s FROM Student s "
								+ "WHERE s.firstname LIKE ?1 "
								+ "AND s.lastname LIKE ?2", Student.class)
								.setParameter(1, firstname)
								.setParameter(2, lastname)
								.getSingleResult();
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}
    
    

}
