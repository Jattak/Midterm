package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	public Enrollment (UUID SectionID, UUID StudentID, UUID EnrollmentID, double Grade) {
		this.SectionID = SectionID;
		this.StudentID = SectionID;
		this.EnrollmentID = EnrollmentID;
		this.Grade = Grade;	
	}

	private Enrollment() {
		super();	
	}
	
	
}
