package org.example;

public class Testing01 {


    public static void main(String[] args) {
        int primeCnt = 0;
        for (int num = 10; num <= 50; num++) {
            if (isPrime(num)) {
                System.out.println("number " + num + " is a prime number");
                primeCnt++;
                if (primeCnt == 3) {
                    System.out.println("Found 3 - exiting for loop");
                    break;
                }

            }
        }
//        System.out.println("Total number of prime number between 10 and 50 is " + primeCnt);

    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}


