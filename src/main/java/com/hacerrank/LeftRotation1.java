package com.hacerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation1 {

    public static void main(String[] args) {
        int []arr=new int[5];

    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//1. way
//        List<Integer> temp=new ArrayList<>();
//
//        for(int i=0;i<d;i++){
//            temp.add(arr.get(i));
//        }
//
//        for(int i=0;i<arr.size()-d;i++){
//            arr.set(i, arr.get(i+d));
//        }
//
//        for(int i=arr.size()-d ,j=0; i< arr.size() &&j<d;i++,j++){
//            arr.set(i, temp.get(j));
//        }
//
//        return arr;

        //second way
        List<Integer> temp=new ArrayList<>();


        List<Integer> temp2=new ArrayList<>();
        temp.addAll(arr.subList(0,d));
        temp2.addAll(arr.subList(d,arr.size()));

        arr.clear();
        arr.addAll(temp2);
        arr.addAll(temp);
        return arr;



    }
}
