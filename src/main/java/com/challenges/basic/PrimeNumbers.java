package com.challenges.basic;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int count=0;
        do{
            int n =  scanner.nextInt();
            if(n == 1){
                System.out.println("Not Prime");
            }
            else if(n != 2 && n % 2 == 0 ){
                System.out.println("Not prime");
            }
            else{
                for(int i=1; i <= n; i++){
                    if(n % i == 0){
                        count++;
                        if(count > 2){
                            System.out.println("Not Prime");
                            break;
                        }
                        else if(i == n && count == 2){
                            System.out.println("Prime");
                        }
                    }
                }
            }


            T--;
            count = 0;

        }while(T > 0);

        scanner.close();
    }
}
