package com.hacerrank;

import java.util.List;
import java.util.stream.LongStream;

public class AveryBigSum {

    public static long aVeryBigSum(List<Long> ar) {

        long sum=0;
        for(Long a: ar){
            sum+=a;
        }
        return sum;

    }
}
