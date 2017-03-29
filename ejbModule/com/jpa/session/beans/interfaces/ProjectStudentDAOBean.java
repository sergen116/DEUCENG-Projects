package com.jpa.session.beans.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.jpa.entities.ProjectStudent;
import com.jpa.entities.Project_studentPK;
import com.jpa.entities.Student;

@Local
public interface ProjectStudentDAOBean {
	public List<ProjectStudent> getAllProjectStudents();

	public ProjectStudent getProjectStudent(Project_studentPK id);

	public List<ProjectStudent> getStudents_Of_A_Project(int project_id);
	
	public List<Integer> getStudent_IDs(int project_id);

	public ProjectStudent create(ProjectStudent projectStudent);

	public ProjectStudent update(ProjectStudent projectStudent);

	public void remove(Project_studentPK id);
}
