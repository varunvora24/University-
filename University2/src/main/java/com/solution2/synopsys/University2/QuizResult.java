package com.solution2.synopsys.University2;

import java.time.LocalDate;

public class QuizResult implements AssessmentResult {
	
	private int studentId;
	private int quizId;
	private LocalDate quizDate;
	private String marks;
	
	public QuizResult(int studentId, int quizId, LocalDate quizDate) {
        this.studentId = studentId;
        this.quizId = quizId;
        this.quizDate = quizDate;
        this.marks = "DNF";  // default value for marks
    }

    // Get the QuizResult object
    @Override
    public QuizResult getAssessmentResult() {
        return this;
    }

    // Set the QuizResult object
    @Override
    public void setAssessmentResult(AssessmentResult result) {
        this.studentId = result.getStudentId();
        this.quizId = ((QuizResult)result).quizId;
        this.quizDate = ((QuizResult)result).quizDate;
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

    // Get the marks obtained by the student
    @Override
    public String getMarks() {
        return marks;
    }

    // Set the marks obtained by the student
    @Override
    public void setMarks(String marks) {
        this.marks = marks;
    }

    // Get the quiz ID
    public int getQuizId() {
        return quizId;
    }

    // Set the quiz ID
    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    // Get the date on which the quiz was taken
    public LocalDate getQuizDate() {
        return quizDate;
    }

    // Set the date on which the quiz was taken
    public void setQuizDate(LocalDate quizDate) {
        this.quizDate = quizDate;
    }
}