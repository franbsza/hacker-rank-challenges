package com.challenges.basic;

import java.util.List;

public class ReversedArray {

    public String solveQuestion(List<Integer> arr){
            StringBuilder s = new StringBuilder();

            for(int i = arr.size()-1; i > 0; i--){
                s.append(arr.get(i)).append(" ") ;
            }
            if(arr.size() > 1){
                s.append(arr.get(0));
            }

            String res = s.toString();

        return res;
    }
}
