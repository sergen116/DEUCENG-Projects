package com.jpa.session.beans.implemantations;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.jpa.entities.Milestone;
import com.jpa.entities.Project;
import com.jpa.session.beans.interfaces.MilestoneDAOBean;

/**
 * Session Bean implementation class MilestoneDAOBeanImpl
 */
@Stateless
public class MilestoneDAOBeanImpl implements MilestoneDAOBean {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public MilestoneDAOBeanImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Milestone> getAllMilestones() {
		// burda sorun olabilir Internship table isminden DÝKKAT !
		return em.createQuery("SELECT m FROM Milestone m", Milestone.class)
				.getResultList();
	}

	@Override
	public List<Milestone> getMilestones_of_Project(int project_id) {
		List<Milestone> milestones = null;

		try {
			milestones = em
					.createQuery(
							"SELECT m FROM Milestone m "
									+ "WHERE m.fk_project_id = ?1",
							Milestone.class).setParameter(1, project_id)
					.getResultList();
		} catch (NoResultException e) {
			e.printStackTrace();
		}

		return milestones;
	}

	@Override
	public Milestone getMilestone(int id) {
		// TODO Auto-generated method stub
		return em.find(Milestone.class, id);
	}

	@Override
	public Milestone create(Milestone milestone) {
		em.persist(milestone);
		return milestone;
	}

	@Override
	public Milestone update(Milestone milestone) {
		em.merge(milestone);
		return milestone;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		em.remove(getMilestone(id));
	}

}
