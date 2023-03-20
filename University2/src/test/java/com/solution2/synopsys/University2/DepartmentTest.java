package com.solution2.synopsys.University2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DepartmentTest {
	@Test
	public void addProgram() {
	    Department dept = new Department("Computer Science", 1); // create a new department
	    Program prog = new Program("Software Engineering", 5301); // create a new program
	    dept.addProgram(prog); // add the program to the department
	    assertEquals(1, dept.getProgramList().size()); // check if program is added successfully
	}

	@Test
	public void removeProgram() {
	    Department dept = new Department("Computer Science", 1); // create a new department
	    Program prog1 = new Program("Software Engineering", 5301); // create first program
	    Program prog2 = new Program("Data Science", 5614); // create second program
	    dept.addProgram(prog1); // add the first program to the department
	    dept.addProgram(prog2); // add the second program to the department
	    dept.removeProgram(5301); // remove the first program
	    assertEquals(1, dept.getProgramList().size()); // check if program is removed successfully
	}

	@Test
	public void updateProgram() {
	    Department dept = new Department("Computer Science", 1); // create a new department
	    Program prog1 = new Program("Software Engineering", 5301); // create first program
	    Program prog2 = new Program("Data Science", 5614); // create second program
	    dept.addProgram(prog1); // add the first program to the department
	    dept.addProgram(prog2); // add the second program to the department
	    Program updatedProg1 = new Program("Software Engineering - Updated", 5301); // create updated program
	    dept.updateProgram(updatedProg1); // update the first program
	    assertEquals("Software Engineering - Updated", dept.getProgramList().get(0).getProgName()); // check if program is updated successfully
	}
}
