package com.basiccodepractise;

public class primenumberpractise {
    public static void main(String args[]){

       int count=0;
       for(int i=1;i<50; i++) {
           if (isPrime(i)) {
               count++;
               System.out.println("number" + i + "is prime number");
               if (count == 10) {
                   System.out.println("exit");
                   break;
               }
           }
       }

        }
       public static boolean isPrime(int n){
           if(n==1){
               return false;
           }
           for(int i=2; i<=n/2;i++){
               if(n%i==0){
                   return false;
               }
           }
           return true;

    }
}
