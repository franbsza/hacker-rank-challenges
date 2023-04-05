package com.challenges.basic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void executeTest(){
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        solveQuestion(arr);
    }

    public static void solveQuestion(List<Integer> arr){

        arr.size();
        double countPos = 0;
        double countNeg = 0;
        double countZero = 0;

        for(int n : arr){
            if(n > 0){
                countPos++;
            }
            else if(n < 0){
                countNeg++;
            }
            else{
                countZero++;
            }
        }

        BigDecimal taxPos = new BigDecimal(
                countPos / arr.size())
                .setScale(6, RoundingMode.HALF_DOWN);

        BigDecimal taxNeg = new BigDecimal(
                countNeg / arr.size())
                .setScale(6, RoundingMode.HALF_DOWN);

        BigDecimal taxZero = new BigDecimal(
                countZero / arr.size())
                .setScale(6, RoundingMode.HALF_DOWN);

        System.out.println(taxPos);
        System.out.println(taxNeg);
        System.out.println(taxZero);
    }
}
