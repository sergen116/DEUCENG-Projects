package com.jpa.session.beans.interfaces;

import java.util.List;
import javax.ejb.Local;
import com.jpa.entities.Project;

@Local
public interface ProjectBean {
	
	public List<Project> getFacultyMemberProjects(int faculty_member_id);
	public Project getProject(String projectName);
}
