package com.jpa.session.beans.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.jpa.entities.FacultyMember;


@Local
public interface FacultyMemberDAOBean {
	
	public List<FacultyMember> getAllFacultyMembers();
	public FacultyMember getFacultyMember(int id);
	public FacultyMember create(FacultyMember facultyMember);
	public FacultyMember update(FacultyMember facultyMember);
	public void remove(int id);
}
