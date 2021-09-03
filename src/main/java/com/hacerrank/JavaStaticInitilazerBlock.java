package com.hacerrank;

import java.util.Scanner;

public class JavaStaticInitilazerBlock {

    Scanner scan=new Scanner(System.in);

    static int H;
    static int B;
    static boolean flag=true;
    static{
        Scanner scan=new Scanner(System.in);
         H=scan.nextInt();
         B=scan.nextInt();

        if(!((H>0&&H<=100) && (B>0&&B<=100))){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }

    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }

}
