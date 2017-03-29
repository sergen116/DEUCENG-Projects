package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Project_student
 *
 */
@Entity
@Table(name="project_student")

@IdClass(Project_studentPK.class)
public class ProjectStudent implements Serializable {
	
	private static final long serialVersionUID = 1L;
	   
	@Id
	private int fk_project_id;  
	
	@Id
	private int fk_student_id;
	
	/**
	 * Many-To-One Relationship Mapping
	 */
	@ManyToOne
	private Student student;
	
	/**
	 * Many-To-One Relationship Mapping
	 */
	@ManyToOne
	private Project project_student;
	
	public ProjectStudent() {
		
	} 
	
	 
	public int getFk_project_id() {
		return this.fk_project_id;
	}

	public void setFk_project_id(int fk_project_id) {
		this.fk_project_id = fk_project_id;
	}   
	public int getFk_student_id() {
		return this.fk_student_id;
	}

	public void setFk_student_id(int fk_student_id) {
		this.fk_student_id = fk_student_id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Project getProject_student() {
		return project_student;
	}
	public void setProject_student(Project project_student) {
		this.project_student = project_student;
	}
	
   
}
