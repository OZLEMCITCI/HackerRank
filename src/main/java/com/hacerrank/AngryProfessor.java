package com.hacerrank;

import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
//assign zero to initial value of onTimeStudents
        int onTimeStudents=0;
        //loop to check each on time students
        for(int student: a){
            if(student<=0){
                onTimeStudents++;//increment if student is on time
            }
        }
        return ((onTimeStudents>=k) ?"NO":"YES");//set class cancellation



    }
}
