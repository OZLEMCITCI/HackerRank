package com.hacerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SparseArrays {

     //Time Complexity is O(N^2)
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        int counter=0;
        List<Integer> list=new ArrayList<>();
        for(String s: queries){
            for(String w: strings){
                if(s.equals(w)){
                    counter ++;
                }
            }
            list.add(counter);
            counter=0;
        }
        return list;
    }

    //Time Complexity is better O(N)
    public static List<Integer> matchingStrings2(List<String> strings, List<String> queries){
        List<Integer> list=new ArrayList<>();
        Map<String, Long> stringMap =
                strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String w: queries ){
            if(stringMap.containsKey(w)){
                list.add(stringMap.get(w).intValue());
            }else{
                list.add(0);
            }
        }
        return list;

    }

}

