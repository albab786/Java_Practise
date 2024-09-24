package com.practise;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mydob {
    public static void main(String[] args) {
       LocalDate current= LocalDate.now();
        System.out.println(current.getDayOfWeek());
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println();
    }
}
