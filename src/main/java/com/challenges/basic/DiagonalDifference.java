package com.challenges.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiagonalDifference {

    public void executeTest(){
        List<Integer> arrAux = new ArrayList<>(10);
        List<Integer> arrAux2 = new ArrayList<>(10);
        List<List<Integer>> arr = new ArrayList<>(10);

        Random random = new Random();


        for (int i = 0; i < 10; i++) {

            Integer elem = Integer.parseInt(String.valueOf(random.nextInt(10)));
            arrAux.add(elem);
        }

        for (int j = 0; j < 10; j++) {
            arr.add(arrAux);
        }

        System.out.println(arr);
        solveQuestion(arr);
    }

    static void solveQuestion(List<List<Integer>> arr){

        int sumRight = 0;
        int sumLeft = 0;
        for(int i=0; i < arr.size(); i++){

            for(int j=0 ; j < arr.size(); j++){

                if( i == j)  {
                    sumRight  = sumRight + arr.get(i).get(j);

                    sumLeft = sumLeft + arr.get(i).get(arr.size() - 1 - i);
                }
            }
        }
        System.out.println("sumRight "+ sumRight);
        System.out.println("sumLeft "+ sumLeft);
        int difference = (sumRight - sumLeft);
        if(difference < 0){
            difference = difference * -1;
        }

        System.out.println("Difference "+ difference);

    }
}
