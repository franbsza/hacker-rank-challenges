package com.challenges.recursion;

public class Factorial {

    public int solveQuestion(int n){

        if(n <= 0){
            return 1;
        }
        return n * solveQuestion(n-1);
    }
}
