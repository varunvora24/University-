package com.solution2.synopsys.University2;

import static org.junit.Assert.assertFalse;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private Student student;
    private AssignmentResult assignmentResult;
    private ExamResult examResult;
    private QuizResult quizResult;

    @Before
    public void setup() {
        student = new Student("Varun Vora", "9819427611", "varun@gmail.com", 2);  // initialize the Student object
        assignmentResult = new AssignmentResult(student.getStudentId(), 2001, LocalDate.now());  // initialize the AssignmentResult object
        examResult = new ExamResult(student.getStudentId(), 1001, LocalDate.now());  // initialize the ExamResult object
        quizResult = new QuizResult(student.getStudentId(), 3001, LocalDate.now());  // initialize the QuizResult object
    }

    @Test
    public void testAssignmentResults() {
        student.getAssignmentResults().add(assignmentResult);  // add the AssignmentResult object to the student's assignment results list
        assertFalse(student.getAssignmentResults().isEmpty());  // check that the list is not empty
    }

    @Test
    public void testExamResults() {
        student.getExamResults().add(examResult);  // add the ExamResult object to the student's exam results list
        assertFalse(student.getExamResults().isEmpty());  // check that the list is not empty
    }

    @Test
    public void testQuizResults() {
        student.getQuizResults().add(quizResult);  // add the QuizResult object to the student's quiz results list
        assertFalse(student.getQuizResults().isEmpty());  // check that the list is not empty
    }
}
