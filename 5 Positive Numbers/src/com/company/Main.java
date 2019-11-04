package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int Array[][];
        int positiveNumberArray[][];
        double ArithmeticMean[];

        Array = new int[5][5];
        positiveNumberArray = new int[5][5];
        ArithmeticMean = new double[5];

        generationTwoDivisionArray(Array);
        seeTwoDivisionArray(Array);

        deleteMinusNumber(Array, positiveNumberArray);
        seeTwoDivisionArray(positiveNumberArray);

        findingArithmeticMean(positiveNumberArray, ArithmeticMean);
        seeOneDivisionArray(ArithmeticMean);

        System.out.println("The line number of the arithmetic mean of which is the maximum is: " +
                (findMaximumValueIndex(ArithmeticMean)+1));

    }

    public static void generationTwoDivisionArray(int Array[][]){
        for(int i = 0; i < Array.length; i++){
            for(int j = 0; j < Array.length; j++){
                Array[i][j] = (int)(Math.random()*(-20))+10;
            }
        }
    }

    public static int findMaximumValueIndex(double Array[]){
        int maxIndex = 0;
        double maxValue = 0;
        for(int i = 0; i < Array.length; i++){
            if(maxValue < Array[i]){
                maxValue = Array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void findingArithmeticMean(int Array[][], double ArithmeticMean[]){
        for(int i = 0; i < Array.length; i++) {
            int count = 0, sum = 0;
            for (int j = 0; j < Array[i].length; j++) {
                if (Array[i][j] >= 0) {
                    sum += Array[i][j];
                    count++;
                }
            }
            if (count > 0) {
                ArithmeticMean[i] = ((1 / (double)count) * (double)sum);
            }
        }
    }

    public static void deleteMinusNumber(int[][] originalArray, int[][] changeArray){
        for(int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray.length; j++) {
                if(originalArray[i][j] >= 0){
                    changeArray[i][j] = originalArray[i][j];
                }
                else{
                    changeArray[i][j] = -1;
                }
            }
        }
    }

    public static void seeTwoDivisionArray(int Array[][]){
        for(int i = 0; i < Array.length; i++){
            for(int j = 0; j < Array.length; j++){
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void seeOneDivisionArray(double Array[]){
        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + "\t");
        }
        System.out.println();
    }

}
