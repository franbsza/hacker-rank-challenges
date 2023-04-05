package com.challenges.basic;

import java.util.Scanner;

public class IntoConditional {

    public static void executeTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int N = scanner.nextInt();

        if(N >= 1 && N <= 100){

            if(N % 2 != 0){
                System.out.println("Weird");
            }
            else if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }

            else if(N >= 6 && N <= 20){
                System.out.println("Weird");
            }
            else if(N > 20){
                System.out.println("Not Weird");
            }
        }
    }
}
