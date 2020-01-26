package com.basiccodepractise;
//test
//
public class forlooppractise {
    public static void main(String args[]){

        printDayOfTheWeek(1,2);


        for(int i=2;i<=10;i++){
            System.out.println("printDayOfTheWeek" + String.format("%.2f",printDayOfTheWeek(10000, i)));
        }

        for(int j=8;j>=1;j--){
            System.out.println("printDayOfTheWeek" + String.format("%.2f",printDayOfTheWeek(10000, j)));
        }
    }

    public static double printDayOfTheWeek(double amount, double interestRate){
        
       return (amount *(interestRate/100));


    }
}
