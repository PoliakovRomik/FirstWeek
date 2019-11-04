package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int firstArray[];
	    int secondArray[];

	    System.out.print("Enter the length of first array:");
        firstArray = new int[userEnterArrayLength()];
        System.out.print("Enter the length of second array:");
        secondArray = new int[userEnterArrayLength()];

        generationRandomArray(firstArray, -10,10);
        generationRandomArray(secondArray,-10, 10);

        seeArray(firstArray);
        System.out.println();
        seeArray(secondArray);

        System.out.print("\n"+searchIdenticalNumber(firstArray, secondArray));
    }

    public static void generationRandomArray(int[] Array, int startOfRange, int endOfRange){
        for(int i = 0; i < Array.length; i++){
            Array[i] = (int)(Math.random()*(endOfRange-startOfRange))+startOfRange;
        }
    }

    public static void seeArray(int[] Array){
        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }

    public static int enterData(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static int userEnterArrayLength(){
        int arrayLength;
        do{
            arrayLength = enterData();
            if(arrayLength < 1){
                System.out.println("The length of array must be greater than 1!\nRepeat again!\n");
            }
        }while (arrayLength < 1);
        return arrayLength;
    }

    public static String searchIdenticalNumber(int[] firstArray, int[] secondArray){
        String Results="";
        for(int i = 0; i < firstArray.length; i++){
            for (int j = 0; j < secondArray.length; j++){
                if(firstArray[i] == secondArray[j]){
                  Results += Integer.toString(firstArray[i]) + " ";
                  break;
                }
            }
        }
        return Results;
    }
}
