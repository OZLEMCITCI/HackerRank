package com.hacerrank;

public class SherlockAndSquares {

    public static void main(String[] args) {

        System.out.println(Math.sqrt(35));
        System.out.println(Math.sqrt(70));
        System.out.println(squares(3,9));
    }

    public static int squares(int a, int b) {
        //Set initial threshold of the range by rolling sqrt of "a" to up.
        int floorNumber=(int)(Math.ceil(Math.sqrt(a)));

        //Set final threshold of the range by rolling sqrt of "a" to down.
        int ceilNumber=(int)(Math.floor(Math.sqrt(b)));
        //differences between two threshold plus 1 gives the number of squares.
        return ceilNumber-floorNumber +1;

    }

}
