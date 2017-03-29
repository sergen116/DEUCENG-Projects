package com.jpa.session.beans.interfaces;

import javax.ejb.Local;

import com.jpa.entities.Student;

@Local
public interface StudentBean {
	
	public Student findStudentAccordingToFullName(String firstname, String lastname);

}
