package com.solution2.synopsys.University2;

import java.time.LocalDate;

public class ExamResult implements AssessmentResult {
	
	private int studentId;
	private int examId;
	private LocalDate examDate;
	private String marks;
	
	
	public ExamResult(int studentId, int examId, LocalDate examDate) {
	    this.studentId = studentId;
	    this.examId = examId;
	    this.examDate = examDate;
	    this.marks = "DNF"; // default value for marks
	}

	// Get the details of the exam result
	@Override
	public ExamResult getAssessmentResult() {
	    return this;
	}

	// Set the details of the exam result
	@Override
	public void setAssessmentResult(AssessmentResult result) {
	    this.studentId = result.getStudentId();
	    this.examId = ((ExamResult)result).examId;
	    this.examDate = ((ExamResult)result).examDate;
	    this.marks = result.getMarks();
	}

	// Get the student ID
	@Override
	public int getStudentId() {
	    return studentId;
	}

	// Set the student ID
	@Override
	public void setStudentId(int studentId) {
	    this.studentId = studentId;
	}

	// Get the marks of the exam result
	@Override
	public String getMarks() {
	    return marks;
	}

	// Set the marks of the exam result
	@Override
	public void setMarks(String marks) {
	    this.marks = marks;
	}

	// Get the ID of the exam
	public int getExamId() {
	    return examId;
	}

	// Set the ID of the exam
	public void setExamId(int examId) {
	    this.examId = examId;
	}

	// Get the date of the exam
	public LocalDate getExamDate() {
	    return examDate;
	}

	// Set the date of the exam
	public void setExamDate(LocalDate examDate) {
	    this.examDate = examDate;
	}
	
}

