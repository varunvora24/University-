package com.solution2.synopsys.University2;

import java.util.ArrayList;


public class Department {
	private String deptName;
    private int deptId;
    private ArrayList<Program> programList;

   
    public Department(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
        programList = new ArrayList<>();
    }

    // Add new program to the department
    public void addProgram(Program program) {
        programList.add(program);
    }

    // Remove program from the department by program id
    public void removeProgram(int progId) {
        for (Program program : programList) {
            if (program.getProgId() == progId) {
                programList.remove(program);
                break;
            }
        }
    }

    // Update the existing program in the department
    public void updateProgram(Program program) {
        for (int i = 0; i < programList.size(); i++) {
            if (programList.get(i).getProgId() == program.getProgId()) {
                programList.set(i, program);
                break;
            }
        }
    }

    // Get the department name
    public String getDeptName() {
        return deptName;
    }

    // Set the department name
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // Get the department id
    public int getDeptId() {
        return deptId;
    }

    // Set the department id
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    // Get the list of programs in the department
    public ArrayList<Program> getProgramList() {
    	return programList;
    }

    // Set the list of programs in the department
    public void setProgramList(ArrayList<Program> programList) {
    	this.programList = programList;
    }

}
