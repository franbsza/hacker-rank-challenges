/**
 * Task
 * Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
 *
 * Note: 0 is considered to be an even index.
 *
 * Example
 *
 * S = adbecf
 * Print
 * abc def
 *
 */

package com.challenges.strings;

import java.util.Scanner;

public class StringCut {

    public void executeTest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of tests: ");
        int T = scan.nextInt();
        scan.nextLine();

        String[] texts = new String[T];

        String S;
        int j = 0;
        do{
            System.out.println("Digit: ");
            S = scan.next();
            texts[j] = S;
            j++;

        }while(j < T);

        for(String text : texts){
            solveQuestion(text);
        }
    }

    public String solveQuestion(String text){

        String odd = "";
        String even = "";

        for(int i = 0; i < text.length(); i++){

            if(i % 2 == 0){
                String c = text.substring(i, i+1);
                even = even.concat(c);
            }
            else{
                String c = text.substring(i, i+1);
                odd = odd.concat(c);
            }
        }
        return even + " "+ odd;
    }
}
