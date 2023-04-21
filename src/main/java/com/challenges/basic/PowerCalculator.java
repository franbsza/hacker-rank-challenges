/*

In today's challenge, you will practice throwing and propagating an exception.

Write a Calculator class with a single method: int power(int,int).
The power method takes two integers, n and p, as parameters and returns
the integer result of n^p. If either n or p is negative, then the method must
throw an exception with the message: n and p should be non-negative.

 */

package com.challenges.basic;

public class PowerCalculator {

    public int power(int n,int p) throws Exception{

        if(n < 0 || p < 0){
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        int result = 1;
        for (int i = 0 ; i <= p-1 ; i++){
            result = result * n;
        }
        return result;
    }
}
