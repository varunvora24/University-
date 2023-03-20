package com.solution2.synopsys.University2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

public class AssignmentTest {
	
	private Assignment assignment;

	@Before
    public void setUp() {
        assignment = new Assignment(1, LocalDate.of(2023, 4, 25), LocalTime.of(10, 0));  // create a new Assignment object
    }

    @Test
    public void testGetAssessmentDetails() {
        Assessment assessment = assignment.getAssessmentDetails();  // get the assessment details
        assertNotNull(assessment);  // check that the assessment is not null
        assertEquals(1, assessment.getAssessmentId());  // check that the assessment ID is correct
        assertEquals(LocalDate.of(2023, 4, 25), assessment.getAssessmentDate());  // check that the assessment date is correct
        assertEquals(LocalTime.of(10, 0), assessment.getAssessmentTime());  // check that the assessment time is correct
    }

    @Test
    public void testSetAssessmentDetails() {
        Assessment newAssessment = new Assessment(2, LocalDate.of(2023, 5, 25), LocalTime.of(12, 0));  // create a new Assessment object
        assignment.setAssessmentDetails(newAssessment);  // set the assessment details
        assertEquals(2, assignment.getAssessmentId());  // check that the assessment ID has been updated
        assertEquals(LocalDate.of(2023, 5, 25), assignment.getAssessmentDate());  // check that the assessment date has been updated
        assertEquals(LocalTime.of(12, 0), assignment.getAssessmentTime());  // check that the assessment time has been updated
    }
}
