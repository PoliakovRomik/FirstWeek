package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int lengthOfArray;  /* length of array */

        // Enter the length of array
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Enter the length of array:");
            lengthOfArray = in.nextInt();
            if(lengthOfArray < 1){
                System.out.println("The length of array must be greater than 1!\nRepeat again!\n");
            }
        }while (lengthOfArray < 1);

        int Array[];
        Array = new int[lengthOfArray];
        int largestOddNumber;
        int startOfRange;
        int endOfRange;

        // Determine the range for random number generation
        do {
            System.out.print("Enter range[a,b) for random number generation:\n a= ");
            startOfRange = in.nextInt();
            System.out.print(" and b= ");
            endOfRange = in.nextInt();
            if(startOfRange > endOfRange){
                System.out.print("The range you entered is incorrect!\n" +
                        "The start of the range must be less than the end of the range (a<b)\n\n");
            }
        } while (startOfRange > endOfRange);

        // Fill in an array with random numbers from a range [a,b)
        for(int i = 0; i < lengthOfArray; i++){
            Array[i] = (int) (Math.random()*(endOfRange-startOfRange))+startOfRange;
        }

        // Display the array
        for(int i = 0; i < lengthOfArray; i++){
            System.out.print(Array[i] + " ");
        }

        largestOddNumber = startOfRange;

        // Finding the largest odd number from an array
        for (int i = 0; i < lengthOfArray; i++) {
            if(i%2==0){
                if(largestOddNumber<Array[i]) {
                    largestOddNumber = Array[i];
                }
            }
        }

        // Display the largest odd number
        System.out.print("The largest odd number in the Array is: " + largestOddNumber);
    }
}
