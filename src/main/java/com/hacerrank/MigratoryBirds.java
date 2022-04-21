package com.hacerrank;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        //By using functional programing we make group the birds by their type and store put this
        //information to the Map -birdsByTypes
        Map<Integer, Long> birdsByType = arr.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //get max frequency of type of the birds
        Long maxCount = birdsByType.values().stream().
                max(Comparator.naturalOrder()).//compare them base on natural order to get the highest one
                get();

        //filter the ones has max frequency and put them in a list
        List<Integer> typeWithMaxCount = birdsByType.entrySet().stream().
                filter(item -> Objects.equals(item.getValue(), maxCount)).
                map(Map.Entry::getKey).
                collect(Collectors.toList());

        //return the first one on the list which is the most frequent one with the smallest type.
        return typeWithMaxCount.get(0);
    }
}
