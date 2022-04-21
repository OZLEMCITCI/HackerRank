package com.hacerrank;
import java.util.*;
public class MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        //Create an empty TreeMap to store array elements and their frequencies
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        // Add elements of original list to treeMap
        for (int i : brr) {
            int freq = treeMap.getOrDefault(i, 0);
            freq++;
            //adding each element to treemap
            treeMap.put(i, freq);
        }
        // Remove elements of new list
        //Traverse the array arr and for each element in the array
        for (int i : arr) {
            int freq = treeMap.get(i);
            //decrease the frequency by 1
            freq--;
            if (freq == 0)
                //remove the key from the TreeMap
                treeMap.remove(i);
            else
                treeMap.put(i, freq);
        }
        // Create the result array
        Integer[] result = new Integer[treeMap.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : treeMap.entrySet()) {
            //add keys to array.
            result[i++] = integerIntegerEntry.getKey();
        }
        //return array as a list
        return Arrays.asList(result);

    }
}
