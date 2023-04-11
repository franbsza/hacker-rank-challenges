/*Given an array of integers, calculate the ratios of its elements
that are positive, negative, and zero.
Print the decimal value of each fraction on a new line with 6 places
after the decimal.

Note: This challenge introduces precision problems. The test cases
are scaled to six decimal places,
though answers with absolute error of up to 10^4 are acceptable.

Example

arr = [1,1,0,-1,-1]

There are n=5 elements, two positive, two negative and one zero.
Their ratios are 2/5 = 0.400000, 2/5 = 0.400000  and 1/5 = 0.200000 .
Results are printed as:

0.400000
0.400000
0.200000

 */

package com.challenges.basic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

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
