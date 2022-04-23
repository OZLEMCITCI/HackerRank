package com.hacerrank;

import java.util.List;

public class TwoDArrayDS {





    public static void main(String[] args) {

        int [][] arr=new int[4][3];

        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }

    public static int hourglassSum(int [][] arr) {

        int row=arr.length-2;
        int col=arr[0].length-2;
        int max_sum=-63;

        for(int i=0;i<row;i++){
            for(int j=0;i<col;i++){
                int top=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int mid=arr[i+1][j+1];
                int bottom=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                int hung_sum=top+bottom+mid;

                if(hung_sum>max_sum){
                    max_sum=hung_sum;
                }
            }
        }

        return max_sum;
    }
    public static int hourglassSum2(List<List<Integer>> arr) {

        int row=arr.size()-2;
        int col=arr.get(0).size()-2;
        int max_sum=-63;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int top=arr.get(i).get(j)+ arr.get(i).get(j+1)+arr.get(i).get(j+2);
                int mid=arr.get(i+1).get(j+1);
                int bottom=arr.get(i+2).get(j)+ arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                int hung_sum=top+bottom+mid;

                if(hung_sum>max_sum){
                    max_sum=hung_sum;
                }
            }
        }

        return max_sum;
    }
}
