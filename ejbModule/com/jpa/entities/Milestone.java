package com.jpa.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

import com.sun.istack.internal.NotNull;

/**
 * Entity implementation class for Entity: Milestone
 *
 */
@Entity
@Table(name="milestone")
public class Milestone implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_milestone;
	
	@NotNull
	private int fk_project_id;
	
	@NotNull
	private String short_summary;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date deadline;
	
	/**
	 * Many-To-One Relationship Mapping
	 */
	@ManyToOne
	private Project project;
	
	public Milestone() {
		
	}   
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public int getId_milestone() {
		return this.id_milestone;
	}
	public void setId_milestone(int id_milestone) {
		this.id_milestone = id_milestone;
	}   
	public int getFk_project_id() {
		return this.fk_project_id;
	}

	public void setFk_project_id(int fk_project_id) {
		this.fk_project_id = fk_project_id;
	}   
	public String getShort_summary() {
		return this.short_summary;
	}

	public void setShort_summary(String short_summary) {
		this.short_summary = short_summary;
	}   
	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
   
}
