package com.solution2.synopsys.University2;

import java.util.ArrayList;

public class Course {
	
	private String courseName; 
	private int courseId;
	private ArrayList<Exam> courseExams; 
	private ArrayList<Assignment> courseAssignment; 
	private ArrayList<Quiz> courseQuiz; 
	private String teacherName; 
	private ArrayList<Student> studentList; 
	
	
	public Course(String courseName, int courseId, String teacherName) {
	    this.courseName = courseName;
	    this.courseId = courseId;
	    this.teacherName = teacherName;
	    courseExams = new ArrayList<>();
	    courseAssignment = new ArrayList<>();
	    courseQuiz = new ArrayList<>();
	    studentList = new ArrayList<>();
	}
	
	// Add a student to the course
	public void addStudent(Student student) {
	    studentList.add(student);
	}
	
	// Remove a student from the course
	public void removeStudent(int studentId) {
	    for (Student student : studentList) {
	        if (student.getStudentId() == studentId) {
	            studentList.remove(student);
	            break;
	        }
	    }
	}
	
	// Get the name of the course
	public String getCourseName() {
	    return courseName;
	}
	
	// Set the name of the course
	public void setCourseName(String courseName) {
	    this.courseName = courseName;
	}
	
	// Get the ID of the course
	public int getCourseId() {
	    return courseId;
	}
	
	// Set the ID of the course
	public void setCourseId(int courseId) {
	    this.courseId = courseId;
	}
	
	// Get the list of exams for the course
	public ArrayList<Exam> getExams() {
	    return courseExams;
	}
	
	// Get the list of quizzes for the course
	public ArrayList<Quiz> getQuiz() {
	    return courseQuiz;
	}
	
	// Get the list of assignments for the course
	public ArrayList<Assignment> getAssignment() {
	    return courseAssignment;
	}
	
	// Get the name of the teacher for the course
	public String getTeacherName() {
	    return teacherName;
	}
	
	// Set the name of the teacher for the course
	public void setTeacherName(String teacherName) {
	    this.teacherName = teacherName;
	}
	
	// Get the list of students enrolled in the course
	public ArrayList<Student> getStudentList() {
	    return studentList;
	}
	
}



