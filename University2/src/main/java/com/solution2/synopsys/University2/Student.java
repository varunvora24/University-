package com.solution2.synopsys.University2;

import java.util.ArrayList;

public class Student extends Person {
	private int id;
    private ArrayList<AssignmentResult> assignmentResults;
    private ArrayList<ExamResult> examResults;
    private ArrayList<QuizResult> quizResults;

    public Student(String name, String contact, String email, int id) {
        super(name, contact, email);
        this.id = id;
        assignmentResults = new ArrayList<>();
        examResults = new ArrayList<>();
        quizResults = new ArrayList<>();
    }

    // Get the ID of the student
    public int getStudentId() {
        return id;
    }

    // Set the ID of the student
    public void setStudentId(int id) {
        this.id = id;
    }

    // Get the list of assignment results for the student
    public ArrayList<AssignmentResult> getAssignmentResults() {
        return assignmentResults;
    }

    // Get the list of exam results for the student
    public ArrayList<ExamResult> getExamResults() {
        return examResults;
    }

    // Get the list of quiz results for the student
    public ArrayList<QuizResult> getQuizResults() {
        return quizResults;
    }
}

