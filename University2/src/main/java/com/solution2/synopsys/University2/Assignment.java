package com.solution2.synopsys.University2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Assignment extends Assessment {
    public Assignment(int assignmentId, LocalDate assignmentDate, LocalTime assignmentTime) {
        super(assignmentId, assignmentDate, assignmentTime);
    }
}
