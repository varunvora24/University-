package com.solution2.synopsys.University2;

public interface AssessmentResult {
	
	// returns an object of type AssessmentResult
	public AssessmentResult getAssessmentResult(); 

	// sets the values of the given AssessmentResult object to the current object
	public void setAssessmentResult(AssessmentResult result);

	// returns the student ID
	public int getStudentId();

	// sets the student ID
	public void setStudentId(int studentId);

	// returns the marks obtained by the student
	public String getMarks();

	// sets the marks obtained by the student
	public void setMarks(String marks);
}
