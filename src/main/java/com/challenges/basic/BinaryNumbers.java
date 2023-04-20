/*
Task
Given a base-10 integer, n , convert it to binary (base-2). Then find and print the base-10 integer denoting
the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is
common to show the base as a subscript.

Example
n = 125
The binary representation of 125 is 1111101. In base 10, there are 5 and 1 consecutive ones in two groups.
Print the maximum, 5.
 */

package com.challenges.basic;

import java.util.*;

public class BinaryNumbers {
    List<Integer> binary = new ArrayList<>();
    List<Integer> binaryResult = new ArrayList<>();

    //given a number int base 10 (ex. 125) convert to a bytes array
    public List<Integer> toBinaryArray(int num, int pos){

        if(num < 2){
            this.binary.add(pos, 1);
            binaryResult = reverseArray(binary);
            return binaryResult;
        }

        this.binary.add(pos, num % 2) ;
        num = num / 2;

        pos++;

        return toBinaryArray(num, pos);
    }

    public List<Integer> reverseArray(List<Integer> binary){

        for(int i = binary.size()-1, j=0 ; i >= 0; i--, j++){

            binaryResult.add(j, binary.get(i));
        }
        return binaryResult;
    }

    //convert the array to a bytes String base 2 (ex. 11011000)
    public String binaryToString(List<Integer> binary){
        String binaryString = "";

        for (int n : binary) {
            String s = String.valueOf(n);
            binaryString = binaryString + s;
        }
        return binaryString;
    }

    // both functions above can be simplified using just
    // the native method toBinaryString java
    public int countSequentialOnes(int n){
        String binary = Integer.toBinaryString(n);

        int count = 0;
        List<Integer> countOnes = new ArrayList<>();

        for(int i=0; i < binary.length(); i++){
            char s = binary.charAt(i);
            if(s == '1'){
                count++;

                if(i == binary.length()-1){
                    countOnes.add(count);
                }
            }
            else{
                countOnes.add(count);
                count = 0;
            }
        }
        Optional<Integer> c = countOnes.stream().max(Comparator.naturalOrder());
        if(c.isPresent()){
            return countOnes.stream().max(Comparator.naturalOrder()).get();
        }
        return 0;
    }
}
