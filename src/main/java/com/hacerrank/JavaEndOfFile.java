package com.hacerrank;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int number =0;
         while(scan.hasNextLine()){
             number++;
             System.out.println(number +" "+scan.nextLine());
         }

         //OR///
        for(int i = 1; scan.hasNext()== true; i++){
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
