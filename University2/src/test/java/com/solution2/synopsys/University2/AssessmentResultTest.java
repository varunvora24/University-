package com.solution2.synopsys.University2;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class AssessmentResultTest {
	
	// Test the ExamResult class
	@Test
	public void examResultTest() {
	    LocalDate examDate = LocalDate.now();
	    ExamResult examResult = new ExamResult(1, 100, examDate);

	    assertEquals(1, examResult.getStudentId());  // Check the student ID
	    assertEquals(100, examResult.getExamId());  // Check the exam ID
	    assertEquals(examDate, examResult.getExamDate());  // Check the exam date
	    assertEquals("DNF", examResult.getMarks());  // Check the default marks

	    examResult.setStudentId(2);  // Set a new student ID
	    examResult.setExamId(101);  // Set a new exam ID
	    examResult.setExamDate(LocalDate.of(2023, 3, 20));  // Set a new exam date
	    examResult.setMarks("90");  // Set a new marks

	    assertEquals(2, examResult.getStudentId());  // Check the new student ID
	    assertEquals(101, examResult.getExamId());  // Check the new exam ID
	    assertEquals(LocalDate.of(2023, 3, 20), examResult.getExamDate());  // Check the new exam date
	    assertEquals("90", examResult.getMarks());  // Check the new marks
	}

	// Test the QuizResult class
	@Test
	public void quizResultTest() {
	    LocalDate quizDate = LocalDate.now();
	    QuizResult quizResult = new QuizResult(1, 100, quizDate);

	    assertEquals(1, quizResult.getStudentId());  // Check the student ID
	    assertEquals(100, quizResult.getQuizId());  // Check the quiz ID
	    assertEquals(quizDate, quizResult.getQuizDate());  // Check the quiz date
	    assertEquals("DNF", quizResult.getMarks());  // Check the default marks

	    quizResult.setStudentId(2);  // Set a new student ID
	    quizResult.setQuizId(101);  // Set a new quiz ID
	    quizResult.setQuizDate(LocalDate.of(2023, 3, 20));  // Set a new quiz date
	    quizResult.setMarks("80");  // Set a new marks

	    assertEquals(2, quizResult.getStudentId());  // Check the new student ID
	    assertEquals(101, quizResult.getQuizId());  // Check the new quiz ID
	    assertEquals(LocalDate.of(2023, 3, 20), quizResult.getQuizDate());  // Check the new quiz date
	    assertEquals("80", quizResult.getMarks());  // Check the new marks
	}

	// Test the AssignmentResult class
	@Test
	public void assignmentResultTest() {
	    LocalDate assignmentDate = LocalDate.now();
	    AssignmentResult assignmentResult = new AssignmentResult(1, 100, assignmentDate);

	    assertEquals(1, assignmentResult.getStudentId());  // Check the student ID
	    assertEquals(100, assignmentResult.getAssignmentId());  // Check the assignment ID
	    assertEquals(assignmentDate, assignmentResult.getAssignmentDate());  // Check the assignment date
	    assertEquals("DNF", assignmentResult.getMarks());  // Check the default marks

	    assignmentResult.setStudentId(2);  // Set a new student ID
	    assignmentResult.setAssignmentId(101);  // Set a new assignment ID
	    assignmentResult.setAssignmentDate(LocalDate.of(2023, 3, 20));  // Set a new assignment date
	    assignmentResult.setMarks("95");  // Set a new marks

        assertEquals(2, assignmentResult.getStudentId()); // Check the new student ID
        assertEquals(101, assignmentResult.getAssignmentId()); // Check the new assignment ID
        assertEquals(LocalDate.of(2023, 3, 20), assignmentResult.getAssignmentDate()); // Check the new assignment date
        assertEquals("95", assignmentResult.getMarks()); // Check the new marks
    }
}

