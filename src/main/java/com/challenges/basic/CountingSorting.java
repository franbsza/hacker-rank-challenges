/*
Challenge
Given a list of integers, count and return the number of times each value appears as an array of integers.

Each time a value occurs in the original array, you increment the counter at that index. At the end,
run through your counting array, printing the value of each non-zero valued index that number of times.
 */

package com.challenges.basic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingSorting {

    public void executeTest(){
        List<Integer> arr = new ArrayList<>(10);
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Integer elem = Integer.parseInt(String.valueOf(random.nextInt(10)));
            arr.add(elem);
        }

        solveQuestion(arr);
    }

     public List<Integer> solveQuestion(List<Integer> arr){

        System.out.println(arr);
        int[] arrZeros = new int[arr.size()];

        for(int i=0; i < arr.size(); i++){

            int indx = Integer.parseInt(String.valueOf(arr.get(i))) ;
            arrZeros[indx] = arrZeros[indx] + 1;
        }

         List<Integer> result = IntStream.of(arrZeros)
                 .boxed()
                 .collect(Collectors.toList());

        System.out.println(result);
        return result;
    }
}
