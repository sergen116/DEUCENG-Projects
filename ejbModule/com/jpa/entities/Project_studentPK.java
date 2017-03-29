package com.jpa.entities;

import java.io.Serializable;

/**
 * ID class for entity: Project_student
 *
 */ 
public class Project_studentPK  implements Serializable {   
   
	         
	private int fk_project_id;         
	private int fk_student_id;
	private static final long serialVersionUID = 1L;

	public Project_studentPK() {}
	
	public Project_studentPK(int fk_project_id, int fk_student_id) {
		this.fk_project_id = fk_project_id;
		this.fk_student_id = fk_student_id;
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
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Project_studentPK)) {
			return false;
		}
		Project_studentPK other = (Project_studentPK) o;
		return true
			&& getFk_project_id() == other.getFk_project_id()
			&& getFk_student_id() == other.getFk_student_id();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getFk_project_id();
		result = prime * result + getFk_student_id();
		return result;
	}
   
   
}
