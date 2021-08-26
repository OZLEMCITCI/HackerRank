package com.hacerrank;

import java.util.Scanner;

public class OutPutFormatting {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String s2="               ";
            String s3=s2.substring(0,s1.length());
            s1=s2.replaceFirst(s3,s1);
            if (x / 10 >= 10) {
                System.out.println(s1 + x);
            } else if (x / 10 <= 10 && x / 10 > 0) {
                System.out.println(s1+"0"+x);
            } else if (x / 10 == 0) {
                System.out.println(s1 + "00" + x);
            }
        }
        System.out.println("================================");
    }
}
