package com.jpa.session.beans.implemantations;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.jpa.entities.Internship;
import com.jpa.session.beans.interfaces.InternshipDAOBean;

/**
 * Session Bean implementation class InternshipDAOBeanImpl
 */
@Stateless
public class InternshipDAOBeanImpl implements InternshipDAOBean{
	
	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public InternshipDAOBeanImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Internship> getAllInternships() {
		//burda sorun olabilir Internship table isminden DÝKKAT !
		return em.createQuery("SELECT i FROM Internship i", Internship.class).getResultList();
	}

	@Override
	public Internship getInternship(int id) {
		// TODO Auto-generated method stub
		return em.find(Internship.class, id);
	}

	@Override
	public Internship create(Internship internship) {
		em.persist(internship);
		return internship;
	}

	@Override
	public Internship update(Internship internship) {
		em.merge(internship);
		return internship;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		em.remove(getInternship(id));
	}

}
