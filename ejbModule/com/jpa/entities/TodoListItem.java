package com.jpa.entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

import com.sun.istack.internal.NotNull;

/**
 * Entity implementation class for Entity: Todo_list
 *
 */
@Entity
@Table(name="todo_list")
public class TodoListItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_todo_list;
	
	@NotNull
	private int fk_list_student_id;
	
	@NotNull
	private String status_of_list_item;
	
	@NotNull
	private String explanation;
	
	
	public TodoListItem() {
		
	}
	
	/**
	 * Many-To-One Relationship Mapping
	 */
	@ManyToOne
	private Student student;
	
	public int getId_todo_list() {
		return this.id_todo_list;
	}

	public void setId_todo_list(int id_todo_list) {
		this.id_todo_list = id_todo_list;
	}   
	public int getFk_list_student_id() {
		return this.fk_list_student_id;
	}

	public void setFk_list_student_id(int fk_list_student_id) {
		this.fk_list_student_id = fk_list_student_id;
	}   
	public String getStatus_of_list_item() {
		return this.status_of_list_item;
	}

	public void setStatus_of_list_item(String status_of_list_item) {
		this.status_of_list_item = status_of_list_item;
	}   
	public String getExplanation() {
		return this.explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
   
}
