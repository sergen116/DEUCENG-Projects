package com.jpa.session.beans.implemantations;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.jpa.entities.Project;
import com.jpa.session.beans.interfaces.ProjectBean;

/**
 * Session Bean implementation class ProjectBeanImpl
 */
@Stateless
public class ProjectBeanImpl implements ProjectBean {
	@PersistenceContext
	private EntityManager em;
	
    public ProjectBeanImpl() {   }

    @Override
	public List<Project> getFacultyMemberProjects(int faculty_member_id) {
		List<Project> specificProjects = null;
		try {
			specificProjects = 
					em.createQuery("SELECT p FROM Project p "
									+ "WHERE p.fk_team_leader_id = ?1", Project.class)
									.setParameter(1, faculty_member_id)
									.getResultList();
		} catch (NoResultException e){
			e.printStackTrace();
		}
		return specificProjects;
	}

	@Override
	public Project getProject(String projectName) {
		Project project = null;
		
		try {
			project = em.createQuery("SELECT p FROM Project p "
					+ "WHERE p.project_name LIKE ?1", Project.class)
					.setParameter(1, projectName)
					.getSingleResult();
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return project;
	}

}
