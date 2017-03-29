package com.jpa.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.sun.istack.internal.NotNull;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
@Table(name="student")
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_student;
	
	/**
	 * One-To-Many Relationship Mapping
	 */
	@OneToMany(targetEntity = Internship.class, mappedBy = "student")
	protected List<Internship> internships;
	
	/**
	 * One-To-Many Relationship Mapping
	 */
	@OneToMany(targetEntity = TodoListItem.class, mappedBy = "student")
	protected List<TodoListItem> todo_list;
	
	/**
	 * One-To-Many Relationship Mapping
	 */
	@OneToMany(targetEntity = ProjectStudent.class, mappedBy = "student")
	protected List<ProjectStudent> registered_projects;
	
	@NotNull
	private String year_enrolled;
	
	@NotNull
	private double gpa;
	
	@NotNull
	private String interests;
	
	@NotNull
	private String firstname;
	
	@NotNull
	private String lastname;
	
	@NotNull
	private String password;
	
	@NotNull
	private String email;

	public Student() {
		
	}
	
	public List<Internship> getInternships() {
		return internships;
	}

	public void setInternships(List<Internship> internships) {
		this.internships = internships;
	}

	@Override
	public String toString() {
		return this.firstname + " " + this.lastname;
	}

	@Override
	public boolean equals(Object object) {
		// Basic checks.
        if (object == this) return true;
        if (!(object instanceof Student)) return false;

        // Property checks.
        Student other = (Student) object;
        boolean a = false;
        if(this.firstname != null ){
        		a = (this.firstname.equalsIgnoreCase(other.firstname))
        			&& (this.lastname.equalsIgnoreCase(other.lastname))
        			&& (this.password.equalsIgnoreCase(other.password));
        }
        return a;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstname,lastname, password);
	}
	
	public int getId_student() {
		return this.id_student;
	}

	public void setId_student(int id_student) {
		this.id_student = id_student;
	}   
	public String getYear_enrolled() {
		return this.year_enrolled;
	}

	public void setYear_enrolled(String year_enrolled) {
		this.year_enrolled = year_enrolled;
	}   
	public double getGpa() {
		return this.gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}   
	public String getInterests() {
		return this.interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
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
