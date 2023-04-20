/*
Given an array of integers, where all elements but one occur twice, find the unique element.

Example

a = [1,2,3,4,3,2,1]
The unique element is 4.

 */

package com.challenges.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class LonelyInteger {

    public void executeTest(){
        Random random = new Random();

        Integer[] arr = new Integer[9];

        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = random.nextInt(100);
            if((i+1) != arr.length){
                arr[i+1] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr) );

        solveQuestion(Arrays.asList(arr));
    }


    public int solveQuestion(List<Integer> arr){

        HashSet<Integer> copy = new HashSet<>();
        for(int i=0 ; i < arr.size(); i++){

           if(!copy.contains(arr.get(i))) {
               copy.add(arr.get(i));
           }
           else{
               copy.remove(arr.get(i));
           }
        }
        int num = 0;
        for (Integer item: copy){
            num = item;
            System.out.println(num);
        }
        return num;
    }
}
