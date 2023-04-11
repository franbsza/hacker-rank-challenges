/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example
arr = [1,3,5,7,9]

The minimum sum is 1+3+5+7 = 16 and the maximum sum is 3+5+7+9 = 24.
The function prints
    16 24

 */

package com.challenges.basic;
import java.util.List;

public class MiniMaxSum {

    public static void solveQuestion(List<Integer> arr){
        long a = 0;
        long b = 0;
        long c = 0;
        long d = 0;
        long e = 0;


        for(int i=0 ; i < arr.size(); i++){

            switch (i){
                case 0:
                    b = b + arr.get(i);
                    c = c + arr.get(i);
                    d = d + arr.get(i);
                    e = e + arr.get(i);
                    break;
                case 1:
                    a = a + arr.get(i);
                    c = c + arr.get(i);
                    d = d + arr.get(i);
                    e = e + arr.get(i);
                    break;
                case 2:
                    a = a + arr.get(i);
                    b = b + arr.get(i);
                    d = d + arr.get(i);
                    e = e + arr.get(i);
                    break;
                case 3:
                    a = a + arr.get(i);
                    b = b + arr.get(i);
                    c = c + arr.get(i);
                    e = e + arr.get(i);
                    break;
                case 4:
                    a = a + arr.get(i);
                    b = b + arr.get(i);
                    c = c + arr.get(i);
                    d = d + arr.get(i);
                    break;
                }
            }

        long[] arrSum = new long[5];
        arrSum[0] = a;
        arrSum[1] = b;
        arrSum[2] = c;
        arrSum[3] = d;
        arrSum[4] = e;

        long max = 0;
        long min = 10000000000L;

        for(int i = 0; i < arrSum.length; i++){
            if( arrSum[i] > max){
                max = arrSum[i];

            }
            if(arrSum[i] < min){
                min = arrSum[i];
            }
        }

       System.out.println(min + "  " + max);
    }
}
