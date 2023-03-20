package com.solution2.synopsys.University2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exam extends Assessment {
    public Exam(int examId, LocalDate examDate, LocalTime examTime) {
        super(examId, examDate, examTime);
    }
}