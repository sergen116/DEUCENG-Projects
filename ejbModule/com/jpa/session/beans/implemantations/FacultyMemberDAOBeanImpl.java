package com.jpa.session.beans.implemantations;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.jpa.entities.FacultyMember;
import com.jpa.session.beans.interfaces.FacultyMemberDAOBean;

/**
 * Session Bean implementation class FacultyMemberDAOBeanImpl
 */
@Stateless
public class FacultyMemberDAOBeanImpl implements FacultyMemberDAOBean{
	
	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public FacultyMemberDAOBeanImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<FacultyMember> getAllFacultyMembers() {
		//burda sorun olabilir Internship table isminden DÝKKAT !
		return em.createQuery("SELECT f FROM FacultyMember f", FacultyMember.class).getResultList();
	}

	@Override
	public FacultyMember getFacultyMember(int id) {
		// TODO Auto-generated method stub
		return em.find(FacultyMember.class, id);
	}

	@Override
	public FacultyMember create(FacultyMember facultyMember) {
		em.persist(facultyMember);
		return facultyMember;
	}

	@Override
	public FacultyMember update(FacultyMember facultyMember) {
		em.merge(facultyMember);
		return facultyMember;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		em.remove(getFacultyMember(id));
	}

}
