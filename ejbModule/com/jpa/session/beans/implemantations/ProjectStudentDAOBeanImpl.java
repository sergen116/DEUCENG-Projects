package com.jpa.session.beans.implemantations;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.jpa.entities.ProjectStudent;
import com.jpa.entities.Project_studentPK;
import com.jpa.session.beans.interfaces.ProjectStudentDAOBean;

/**
 * Session Bean implementation class ProjectStudentDAOBeanImpl
 */
@Stateless
public class ProjectStudentDAOBeanImpl implements ProjectStudentDAOBean {
	
	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public ProjectStudentDAOBeanImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<ProjectStudent> getAllProjectStudents() {
		//burda sorun olabilir Internship table isminden DÝKKAT !
		return em.createQuery("SELECT p FROM ProjectStudent p", ProjectStudent.class).getResultList();
	}
	
	@Override
	public List<ProjectStudent> getStudents_Of_A_Project(int project_id) {
		List<ProjectStudent> projectStudents = null;
		
		try {
			projectStudents = 
					em.createQuery("SELECT p FROM ProjectStudent p "
									+ "WHERE p.fk_project_id = ?1", ProjectStudent.class)
									.setParameter(1, project_id)
									.getResultList();
		} catch (NoResultException e){
			e.printStackTrace();
		}
		
		return projectStudents;
	}
	
	@Override
	public List<Integer> getStudent_IDs(int project_id) {
		List<Integer> studentIDs = null;
		
		try {
			studentIDs = 
					em.createQuery("SELECT p.fk_student_id FROM ProjectStudent p "
									+ "WHERE p.fk_project_id = ?1", Integer.class)
									.setParameter(1, project_id)
									.getResultList();
		} catch (NoResultException e){
			e.printStackTrace();
		}
		
		return studentIDs;
	}

	@Override
	public ProjectStudent getProjectStudent(Project_studentPK id) {
		return em.find(ProjectStudent.class, id);
	}

	@Override
	public ProjectStudent create(ProjectStudent projectStudent) {
		em.persist(projectStudent);
		return projectStudent;
	}

	@Override
	public ProjectStudent update(ProjectStudent projectStudent) {
		return projectStudent;
		
	}

	@Override
	public void remove(Project_studentPK id) {
		em.remove(getProjectStudent(id));
	}


	
}
