/*

Task
Given set S = {1,2,3,4,...,N}. Find two integers, A and B (where A < B),
from set S such that the value of A & B is the maximum possible and also
less than a given integer, K . In this case, & represents
the bitwise AND operator.

Function Description
Complete the bitwiseAnd function in the editor below.

bitwiseAnd has the following paramter(s):
- int N: the maximum integer to consider
- int K: the limit of the result, inclusive

Returns
- int: the maximum value of A & B within the limit (K).

 */

package com.challenges.basic;

public class BitwiseAnd {

    public int execute(int N, int K) {
        int maxValue = 0;
        for(int i=1 ; i < N-1 ; i++){

            for(int j=N ; j > 1 ; j--){

                if(i != j || i < j){
                    int value = i & j;
                    if(value > maxValue && value < K){
                        maxValue = value;
                    }
                }
            }
        }
        return maxValue;
    }
}
