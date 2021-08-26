package com.hacerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        int loopEnd=scan.nextInt();

        for(int l=0;l<loopEnd;l++) {


            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int k = 0;
            for (int i = 0; i <= n; i++) {

                k += sumOfPowerTwo(i) * b;

                System.out.print(a + k+" ");
            }

            System.out.println();
        }}


    public static int sumOfPowerTwo(int k){
        return (int)Math.pow(2,k);
    }
}
