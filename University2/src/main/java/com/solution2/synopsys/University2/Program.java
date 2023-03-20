package com.solution2.synopsys.University2;

import java.util.ArrayList;

public class Program {
	private String progName;
    private int progId;
    private ArrayList <Course> courseList;

    public Program(String progName, int progId) {
        this.progName = progName;
        this.progId = progId;
        courseList = new ArrayList<>();
    }

    // Add a course to the program
    public void addCourse(Course course) {
        courseList.add(course);
    }

    // Remove a course from the program
    public void removeCourse(int courseId) {
        for (Course course : courseList) {
            if (course.getCourseId() == courseId) {
                courseList.remove(course);
                break;
            }
        }
    }

    // Get the name of the program
    public String getProgName() {
        return progName;
    }

    // Set the name of the program
    public void setProgName(String progName) {
        this.progName = progName;
    }

    // Get the ID of the program
    public int getProgId() {
        return progId;
    }

    // Set the ID of the program
    public void setProgId(int progId) {
        this.progId = progId;
    }

    // Get the list of courses associated with the program
    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    // Set the list of courses associated with the program
    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
}
