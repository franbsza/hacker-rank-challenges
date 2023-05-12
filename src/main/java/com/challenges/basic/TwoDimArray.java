package com.challenges.basic;

import java.util.*;

public class TwoDimArray {

    public static void solveQuestion(){

        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> arrSum = new ArrayList<>();

        Random random = new Random(10);

        for(int i = 0; i < 6; i++){
            List<Integer> matrixAux = new ArrayList<>();

            for (int j = 0; j < 6; j++) {

                Integer n = Integer.parseInt(String.valueOf(random.nextInt(10)));
                matrixAux.add(n);
            }
            arr.add(matrixAux);
        }


        for(int i = 0; i < arr.size(); i++) {

            for(int j = 0; j < arr.get(i).size(); j++) {
                int sum = 0;

                if(i != 0 && i != 5 && j != 0 && j != 5){

                    sum = arr.get(i).get(j)
                            + arr.get(i-1).get(j-1)
                            + arr.get(i-1).get(j)
                            + arr.get(i-1).get(j+1)
                            + arr.get(i+1).get(j-1)
                            + arr.get(i+1).get(j)
                            + arr.get(i+1).get(j+1);


                    arrSum.add(sum);
                }

            }
        }

       Optional<Integer> max = arrSum.stream().max(Comparator.naturalOrder());
        if(max.isPresent()){
            System.out.println(max.get());
        }
    }
}
