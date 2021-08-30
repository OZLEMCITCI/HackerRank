package com.hacerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        List<Long> arr = new ArrayList<Long>();

        arr.add(1L);
        arr.add(2L);
        arr.add(4L);
        arr.add(11L);
        arr.add(12L);
        arr.add(8L);


        System.out.println(doubleSize(arr, 2));
    }

    public static long doubleSize(List<Long> arr, long b) {


        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == b) {
                b = b * 2;
            }

            if (b == 16) {
                break;
            }

        }
        return b;
    }

    public static int countPairs(List<Integer> nums, int k) {
        Set<String> uniquePairs = new HashSet<>();
        int[] arr = nums.stream().mapToInt(i -> i).sorted().distinct().toArray();

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((k >= 0 ? arr[j] - arr[i] : arr[i] - arr[j]) == k)
                    uniquePairs.add(arr[i] + ":" + arr[j]);

        return uniquePairs.size();
    }

}
