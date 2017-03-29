package com.jpa.session.beans.interfaces;

import java.util.List;
import javax.ejb.Local;
import com.jpa.entities.Project;

@Local
public interface ProjectDAOBean {
	public List<Project> getAllProjects();
	public Project getProject(int id);
	public Project create(Project project);
	public Project update(Project project);
	public void remove(int id);
}
