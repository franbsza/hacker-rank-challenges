package com.challenges.basic;

import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite date returned");
        int DR = scanner.nextInt();
        int MR = scanner.nextInt();
        int YR = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Digite due date");
        int DD = scanner.nextInt();
        int MD = scanner.nextInt();
        int YD = scanner.nextInt();

        int hackos = 0;
        int months = 0;
        int days = 0;

        if(YR > YD){
            hackos = 10000;

        } else if(YR == YD && MR > MD){

            months = MR - MD;
            hackos = 500 * months;

        }else if(MR == MD && DR > DD){
            days = DR - DD;
            hackos = 15 * days;
        }

        System.out.println(hackos);
    }
}
