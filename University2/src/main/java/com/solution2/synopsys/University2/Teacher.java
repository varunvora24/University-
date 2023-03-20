package com.solution2.synopsys.University2;

public class Teacher extends Person {
    private int id;

    public Teacher(String name, String contact, String email, int id) {
        super(name, contact, email);
        this.id = id;
    }

    // Get the teacher ID
    public int getTeacherId() {
        return id;
    }

    // Set the teacher ID
    public void setTeacherId(int id) {
        this.id = id;
    }
}
