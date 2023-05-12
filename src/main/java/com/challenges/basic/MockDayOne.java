package com.challenges.basic;

import java.util.*;

public class MockDayOne {

    public void executeTest(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 4;
        arr[2] = 10;
        arr[3] = 445;
        arr[4] = 9;

       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));

       int position = arr.length / 2 ;
        System.out.println(arr[position]);
        System.out.println(arr[position]);

        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(-33);
        numbers.add(9);
        int pos = numbers.size() / 2;
        System.out.println("meio: " + numbers.get(pos));

        // sort the ArrayList in ascending order
        numbers.sort(Comparator.naturalOrder());

        System.out.println("Sorted ArrayList: " + numbers);
    }

    static int[] sortArray(int[] newArray, int[] arr, int i){

            if(i == arr.length){
                return newArray;
            }
            else if(i == 0){
                newArray[i] = arr[i];
            }
            else if (arr[i] < arr[i-1]){
                newArray[i] = arr[i-1];
                newArray[i-1] = arr[i];
            }else{
                newArray[i] = arr[i];
            }
        i++;
        return sortArray(newArray, arr, i);
    }
}
