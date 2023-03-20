package com.solution2.synopsys.University2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProgramTest {
	
	@Test
    public void addCourse() {
        Program prog = new Program("Software Engineering", 5301);  // create a new Program object
        Course course = new Course("Java", 23, "Varun Vora");  // create a new Course object
        prog.addCourse(course);  // add the course to the program
        assertEquals(1, prog.getCourseList().size());  // check that the course has been added to the program
    }

    @Test
    public void removeCourse() {
        Program prog = new Program("Software Engineering", 5301);  // create a new Program object
        Course course1 = new Course("Algorithms", 22, "Omkar Swami");  // create a new Course object
        Course course2 = new Course("Java", 23, "Varun Vora");  // create another new Course object
        prog.addCourse(course1);  // add the first course to the program
        prog.addCourse(course2);  // add the second course to the program
        prog.removeCourse(23);  // remove the second course from the program
        assertEquals(1, prog.getCourseList().size());  // check that the second course has been removed from the program
    }
}
