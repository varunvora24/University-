package com.solution2.synopsys.University2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	private Course course;
    private Student student;
    private Teacher teacher;

    @Before
    public void setup() {
        teacher = new Teacher("Anjali Sharma", "3488894562", "anjali@gmail.com", 1);
        course = new Course("Math", 101, teacher.getName());
        student = new Student("Varun Vora", "9819427611", "varun@gmail.com", 2);
    }

    @Test
    public void testAddStudent() {
        course.addStudent(student); // Add a student to the course
        assertEquals(1, course.getStudentList().size()); // Check if the student has been added to the course
    }

    @Test
    public void testRemoveStudent() {
        course.addStudent(student);  // Add a student to the course
        course.removeStudent(student.getStudentId());  // Remove the added student from the course
        assertTrue(course.getStudentList().isEmpty());  // Check if the student has been removed from the course
    }
}
