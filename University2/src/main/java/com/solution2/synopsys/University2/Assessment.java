package com.solution2.synopsys.University2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Assessment {
    private int assessmentId;
    private LocalDate assessmentDate;
    private LocalTime assessmentTime;

    
    public Assessment(int assessmentId, LocalDate assessmentDate, LocalTime assessmentTime) {
        this.assessmentId = assessmentId;
        this.assessmentDate = assessmentDate;
        this.assessmentTime = assessmentTime;
    }

    // Get the details of the assessment
    public Assessment getAssessmentDetails() {
        return this;
    }

    // Set the details of the assessment
    public void setAssessmentDetails(Assessment assessment) {
        this.assessmentId = assessment.assessmentId;
        this.assessmentDate = assessment.assessmentDate;
        this.assessmentTime = assessment.assessmentTime;
    }

    // Get the assessment ID
    public int getAssessmentId() {
        return assessmentId;
    }

    // Set the assessment ID
    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    // Get the assessment date
    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    // Set the assessment date
    public void setAssessmentDate(LocalDate assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    // Get the assessment time
    public LocalTime getAssessmentTime() {
        return assessmentTime;
    }

    // Set the assessment time
    public void setAssessmentTime(LocalTime assessmentTime) {
        this.assessmentTime = assessmentTime;
    }
}