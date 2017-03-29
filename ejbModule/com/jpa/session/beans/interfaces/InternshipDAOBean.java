package com.jpa.session.beans.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.jpa.entities.Internship;


@Local
public interface InternshipDAOBean {
	
	public List<Internship> getAllInternships();
	public Internship getInternship(int id);
	public Internship create(Internship internship);
	public Internship update(Internship internship);
	public void remove(int id);
}
