package com.solution2.synopsys.University2;

import java.time.LocalDate;

public class AssignmentResult implements AssessmentResult {
    private int studentId;
    private int assignmentId;
    private LocalDate assignmentDate;
    private String marks;

 
    public AssignmentResult(int studentId, int assignmentId, LocalDate date) {
        this.studentId = studentId;
        this.assignmentId = assignmentId;
        this.assignmentDate = date;
        this.marks = "DNF"; // Set the default value of marks as "DNF" (Did Not Finish)
    }

    // Get the details of the assignment result
    @Override
    public AssignmentResult getAssessmentResult() {
        return this;
    }

    // Set the details of the assignment result
    @Override
    public void setAssessmentResult(AssessmentResult result) {
        this.studentId = result.getStudentId();
        this.assignmentId = ((AssignmentResult) result).assignmentId;
        this.assignmentDate = ((AssignmentResult) result).assignmentDate;
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

    // Get the marks obtained in the assignment
    @Override
    public String getMarks() {
        return marks;
    }

    // Set the marks obtained in the assignment
    @Override
    public void setMarks(String marks) {
        this.marks = marks;
    }

    // Get the assignment ID
    public int getAssignmentId() {
        return assignmentId;
    }

    // Set the assignment ID
    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    // Get the date on which the assignment was taken
    public LocalDate getAssignmentDate() {
        return assignmentDate;
    }

    // Set the date on which the assignment was taken
    public void setAssignmentDate(LocalDate assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

}




