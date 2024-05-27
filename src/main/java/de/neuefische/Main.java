package de.neuefische;

public class Main {

    /**
     *
     * 1. Ist eine Zahl durch 3 teilbar, soll "Fizz" returned werden.
     * 2. Ist eine Zahl durch 5 teilbar, soll "Buzz" returned werden.
     * 3. Teilbar durch 3 & 5, soll "Fizzbuzz" returned werden.
     * 4. Sonst return Zahl als String!
     */


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static String playFizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        }else if (num % 3 == 0){
            return "Fizz";
        }else if (num % 5 == 0){
            return "Buzz";
        }else {
            return ""+num;
        }

    }
}