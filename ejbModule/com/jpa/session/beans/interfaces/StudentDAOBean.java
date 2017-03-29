package com.jpa.session.beans.interfaces;

import java.util.List;
import javax.ejb.Local;
import com.jpa.entities.Student;

@Local
public interface StudentDAOBean {
	
	public List<Student> getAllStudents();
	public Student getStudent(int id);
	public Student create(Student student);
	public Student update(Student student);
	public void remove(int id);
}
