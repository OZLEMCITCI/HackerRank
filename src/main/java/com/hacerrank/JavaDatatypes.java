package com.hacerrank;

import java.util.Scanner;

public class JavaDatatypes {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long number=sc.nextLong();
                System.out.println(number+" can be fitted in:");
                if (number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE)
                    System.out.println("* byte");

                if (number <= Short.MAX_VALUE && number >= Short.MIN_VALUE)
                    System.out.println("* short");

                if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE)
                    System.out.println("* int");

                if (number <= Long.MAX_VALUE && number >= Long.MIN_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

            }

        }






