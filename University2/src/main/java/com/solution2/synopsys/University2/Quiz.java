package com.solution2.synopsys.University2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Quiz extends Assessment {
    public Quiz(int quizId, LocalDate quizDate, LocalTime quizTime) {
        super(quizId, quizDate, quizTime);
    }
}