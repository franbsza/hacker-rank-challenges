package com.challenges.basic;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

    public static void executeTest(){
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

        MiniMaxSum.solveQuestion(arr);
    }

    static void solveQuestion(List<Integer> arr){
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
