package com.hacerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class matchingBraclets {

    public static void main(String[] args) {
        String expr = "([{}])";

        Scanner scan =new Scanner(System.in);

        if (formatChecker(scan.nextLine()))
            System.out.println("True");
        else
            System.out.println("False");


    }





    public static boolean formatChecker(String str) {

        Deque<Character> deq
                = new ArrayDeque<Character>();


        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if (x == '(' || x == '[' || x == '{') {

                deq.push(x);
                continue;
            }

            if (deq.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = deq.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = deq.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = deq.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }


        return (deq.isEmpty());
    }


}





