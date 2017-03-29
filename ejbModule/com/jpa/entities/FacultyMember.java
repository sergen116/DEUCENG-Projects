package com.jpa.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import com.sun.istack.internal.NotNull;

/**
 * Entity implementation class for Entity: FacultyMember
 *
 */
@Entity
@Table(name="faculty_member")
public class FacultyMember implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_faculty_member;
	
	/**
	 * One-To-Many Relationship Mapping
	 */
	@OneToMany(targetEntity = Project.class, mappedBy = "faculty_member")
	protected List<Project> projects;
	
	@NotNull
	private String academic_title;
	
	@NotNull
	private String research_interests;
	
	@NotNull
	private String firstname;
	
	@NotNull
	private String lastname;
	
	@NotNull
	private String password;
	
	@NotNull
	private String email;
	

	public FacultyMember() {
		
	}   
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public int getId_faculty_member() {
		return this.id_faculty_member;
	}

	public void setId_faculty_member(int id_faculty_member) {
		this.id_faculty_member = id_faculty_member;
	}   
	public String getAcademic_title() {
		return this.academic_title;
	}

	public void setAcademic_title(String academic_title) {
		this.academic_title = academic_title;
	}   
	public String getResearch_interests() {
		return this.research_interests;
	}

	public void setResearch_interests(String research_interests) {
		this.research_interests = research_interests;
	}   
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}   
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
