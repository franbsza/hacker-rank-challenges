package com.challenges.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockDayTwo {

    public void executeTest(){

        List<List<Integer>> matrix = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i < 5; i++){
            List<Integer> matrixAux = new ArrayList<>();

            for (int j = 0; j < 5; j++) {

                Integer n = Integer.parseInt(String.valueOf(random.nextInt(100)));
                matrixAux.add(n);
            }
            matrix.add(matrixAux);
        }

        solveQuestion(matrix);
    }

    public int solveQuestion(List<List<Integer>> matrix){

        int size = matrix.size() / 2;
        int n = matrix.size();
        int sum = 0;

        for(int x=0; x < size; x++){

            for(int y=0 ; y < size; y++){

                int maior = -1;

                if(matrix.get(x).get(y) > maior){
                    maior = matrix.get(x).get(y);
                }
                if(matrix.get(x).get(n-y-1) > maior){
                    maior = matrix.get(x).get(n-y-1);
                }
                if(matrix.get(n-x-1).get(y) > maior){
                    maior = matrix.get(n-x-1).get(y);
                }
                if(matrix.get(n-x-1).get(n-y-1) > maior){
                    maior = matrix.get(n-x-1).get(n-y-1);
                }

                sum += maior;

            }
        }
        return sum;
    }
}
