package com.jpa.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import com.enumTypes.InternshipType;
import com.sun.istack.internal.NotNull;

/**  
 * Entity implementation class for Entity: Internship
 *
 */
@Entity
@Table(name="internship")
public class Internship implements Serializable {
	   
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_internship;
	
	/**
	 * Many-To-One Relationship Mapping
	 */
	@ManyToOne
	private Student student;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date start_date;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date end_date;
	
	@NotNull
	private String company_name;
	
	@NotNull
	private String working_areas;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private InternshipType type;
	
	@NotNull
	private int fk_student_id;
	
	public Internship() {
		
	}   
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getId_internship() {
		return this.id_internship;
	}
	public void setId_internship(int id_internship) {
		this.id_internship = id_internship;
	}   
	public Date getStart_date() {
		return this.start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}   
	public Date getEnd_date() {
		return this.end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}   
	public String getCompany_name() {
		return this.company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}   
	public String getWorking_areas() {
		return this.working_areas;
	}
	public void setWorking_areas(String working_areas) {
		this.working_areas = working_areas;
	}   
	public InternshipType getType() {
		return type;
	}
	public void setType(InternshipType type) {
		this.type = type;
	}
	public int getFk_student_id() {
		return fk_student_id;
	}
	public void setFk_student_id(int fk_student_id) {
		this.fk_student_id = fk_student_id;
	}
	
	
}
