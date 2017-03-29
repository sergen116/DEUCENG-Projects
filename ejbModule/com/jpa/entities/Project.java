	package com.jpa.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.internal.NotNull;

/**
 * Entity implementation class for Entity: Project
 *
 */
@Entity
@Table(name = "project")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_project;

	@NotNull
	private int fk_team_leader_id;

	@NotNull
	private String project_name;

	@NotNull
	private String assigned_assistant;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date deadline;
	
	@Transient
	private List<Student> studentsOfProject;

	/**
	 * One-To-Many Relationship Mapping
	 */
	@OneToMany(targetEntity = ProjectStudent.class, mappedBy = "project_student")
	protected List<ProjectStudent> projectAndStudents;

	/**
	 * One-To-Many Relationship Mapping
	 */
	@OneToMany(targetEntity = Milestone.class, mappedBy = "project")
	protected List<Milestone> milestones;

	/**
	 * Many-To-One Relationship Mapping
	 */
	@ManyToOne
	private FacultyMember faculty_member;

	public Project() {
		projectAndStudents = new ArrayList<ProjectStudent>();
	}

	@Override
	public String toString() {
		return this.project_name;
	}

	@Override
	public boolean equals(Object object) {
		// Basic checks.
		if (object == this)
			return true;
		if (!(object instanceof Project))
			return false;

		// Property checks.
		Project other = (Project) object;
		boolean a = false;
		if (this.project_name != null) {
			a = (this.project_name.equalsIgnoreCase(other.project_name));
		}
		return a;
	}

	@Override
	public int hashCode() {
		return Objects.hash(project_name);
	}

	public List<Student> getStudentsOfProject() {
		return studentsOfProject;
	}

	public void setStudentsOfProject(List<Student> studentsOfProject) {
		this.studentsOfProject = studentsOfProject;
	}

	public List<ProjectStudent> getProjectAndStudents() {
		return projectAndStudents;
	}

	public void setProjectAndStudents(List<ProjectStudent> projectAndStudents) {
		this.projectAndStudents = projectAndStudents;
	}

	public List<Milestone> getMilestones() {
		return milestones;
	}

	public void setMilestones(List<Milestone> milestones) {
		this.milestones = milestones;
	}

	public FacultyMember getFaculty_member() {
		return faculty_member;
	}

	public void setFaculty_member(FacultyMember faculty_member) {
		this.faculty_member = faculty_member;
	}

	public int getId_project() {
		return this.id_project;
	}

	public void setId_project(int id_project) {
		this.id_project = id_project;
	}

	public int getFk_team_leader_id() {
		return this.fk_team_leader_id;
	}

	public void setFk_team_leader_id(int fk_team_leader_id) {
		this.fk_team_leader_id = fk_team_leader_id;
	}

	public String getProject_name() {
		return this.project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getAssigned_assistant() {
		return this.assigned_assistant;
	}

	public void setAssigned_assistant(String assigned_assistant) {
		this.assigned_assistant = assigned_assistant;
	}

	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

}
