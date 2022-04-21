package com.hacerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        //Initialize a String array to convert unsorted List to a String Array
        String[] unsortedArray = new String[unsorted.size()];

        //Loop to add each unsorted List element to the Array
        for (int i = 0; i < unsorted.size(); i++) {
            unsortedArray[i] = unsorted.get(i);
        }
        //Arrays.sort  method is used to sort unsorted array and gets two parameter.
        Arrays.sort(unsortedArray, new Comparator<String>() {
            //overriding comparator method to get ascending order
            @Override
            public int compare(String o1, String o2) {//it will compare two string
                //if length of o1 is more than o2 return -1 and. two elements stay the same spot
                if (o1.length() < o2.length()) {
                    return -1;
                }
                //if length of o1 is less than o2 return 1 and. two elements switch the same spots
                if (o1.length() > o2.length()) {
                    return 1;
                }
                //it  compares two element base on above comparator
                return o1.compareTo(o2);
            }
        });
        //returns array as list.
        return Arrays.asList(unsortedArray);
    }
}
