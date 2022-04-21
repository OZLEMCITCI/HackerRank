package com.hacerrank;

import java.util.ArrayList;
import java.util.List;

public class ReverseAnArray {

    public static void main(String[] args) {

        List <Integer> newList=new ArrayList<>();
        newList.add(1);
        newList.add(4);
        newList.add(3);
        newList.add(2);

        System.out.println(reverseArray(newList));
        System.out.println(reverseArray2(newList));
    }

    public static List<Integer> reverseArray(List<Integer> a) {

        List<Integer> reversedArray=new ArrayList<>();

        for(int i=a.size()-1; i>=0;i--){
            reversedArray.add(a.get(i));
        }
        return reversedArray;
    }

    //fastest way timeComplexity is O(N) and space complexity O(1)
    public static List<Integer> reverseArray2(List<Integer> a) {

        int startPoint=0, endPoint=a.size()-1;
        while(startPoint<endPoint){
            int swing=a.get(startPoint);
            a.set(startPoint,a.get(endPoint));
            a.set(endPoint,swing);
            startPoint++; endPoint--;
        }

        return a;
    }


}
