package com.jpa.session.beans.implemantations;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.jpa.entities.Student;
import com.jpa.session.beans.interfaces.StudentDAOBean;

/**
 * Session Bean implementation class StudentDAOBeanImpl
 */
@Stateless
public class StudentDAOBeanImpl implements StudentDAOBean {

	@PersistenceContext
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public StudentDAOBeanImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Student> getAllStudents() {
		//burda sorun olabilir Student table isminden DÝKKAT !
		return em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
		
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return em.find(Student.class, id);
	}

	@Override
	public Student create(Student student) {
		em.persist(student);
		return student;
	}

	@Override
	public Student update(Student student) {
		em.merge(student);
		return student;
	}

	@Override
	public void remove(int id) {
		em.remove(getStudent(id));
	}

}
