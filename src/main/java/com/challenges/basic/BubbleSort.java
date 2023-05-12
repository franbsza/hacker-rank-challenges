package com.challenges.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort {

    public static void swap(List<Integer> a , int j){
        int tmp = a.get(j);
        a.set(j, a.get(j+1));
        a.set(j+1, tmp);
    }

    public static void main(String[] args) throws IOException {
        Random random = new Random();

        List<Integer> a = new ArrayList<>();
        a.add(random.nextInt(10));
        a.add(random.nextInt(10));
        a.add(random.nextInt(10));
        a.add(random.nextInt(10));
        a.add(random.nextInt(10));
        a.add(random.nextInt(10));

        // Write your code here
        int n = a.size() ;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    swap(a , j);
                    numberOfSwaps++;
                }
            }

            count += numberOfSwaps;

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
            count += numberOfSwaps;

        }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element:  "+a.get(0));
        System.out.println("Last Element: "+a.get(n-1));
    }
}
