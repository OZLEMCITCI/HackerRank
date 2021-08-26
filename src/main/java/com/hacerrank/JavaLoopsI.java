package com.hacerrank;

import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int number=scan.nextInt();

        if(number>20&&number<2){
            System.out.println("please choose number between 20 and 20");
        }
        for(int i=1;i<=10;i++) {
            System.out.println(number+" x "+i+" = "+(number*i));

        }


    }
}
