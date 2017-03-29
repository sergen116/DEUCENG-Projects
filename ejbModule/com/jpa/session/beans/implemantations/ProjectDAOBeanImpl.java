package com.jpa.session.beans.implemantations;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.jpa.entities.Project;
import com.jpa.session.beans.interfaces.ProjectDAOBean;

/**
 * Session Bean implementation class ProjectDAOBeanImpl
 */
@Stateless
public class ProjectDAOBeanImpl implements ProjectDAOBean{
	
	@PersistenceContext
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ProjectDAOBeanImpl() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public List<Project> getAllProjects() {
		//burda sorun olabilir Internship table isminden DÝKKAT !
		return em.createQuery("SELECT p FROM Project p", Project.class).getResultList();
	}
	@Override
	public Project getProject(int id) {
		// TODO Auto-generated method stub
		return em.find(Project.class, id);
	}
	@Override
	public Project create(Project project) {
		em.persist(project);
		return project;
	}
	@Override
	public Project update(Project project) {
		em.merge(project);
		return project;
	}
	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		em.remove(getProject(id));
	}

}
