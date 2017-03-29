package com.jpa.session.beans.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.jpa.entities.Milestone;

@Local
public interface MilestoneDAOBean {
	public List<Milestone> getAllMilestones();
	public List<Milestone> getMilestones_of_Project(int project_id);
	public Milestone getMilestone(int id);
	public Milestone create(Milestone milestone);
	public Milestone update(Milestone milestone);
	public void remove(int id);
}
