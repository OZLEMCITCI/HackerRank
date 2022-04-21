package com.hacerrank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaDateAndTime {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();


        


    }




    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year,month,day).getDayOfWeek().toString();

    }
}
