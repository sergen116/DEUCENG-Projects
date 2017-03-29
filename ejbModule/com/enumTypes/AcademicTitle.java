package com.enumTypes;

public enum AcademicTitle {
	Title_Prof("Prof. Dr."), 
	Title_Assoc_Prof("Assoc. Prof. Dr."),
	Title_Asst_Prof("Asst. Prof. Dr."),
	Title_Instructor_Dr("Instructor Dr."),
	Title_Instructor("Instructor");

	String value;

	AcademicTitle(String value) {
		this.value = value;
	}

	static AcademicTitle byValue(String value) {
		for (AcademicTitle academic_title : AcademicTitle.values()) {
			if (academic_title.value.equals(value)) {
				return academic_title;
			}
		}

		return null;
	}
}
