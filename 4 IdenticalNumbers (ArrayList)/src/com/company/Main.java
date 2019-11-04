package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Creating ArrayList's
        ArrayList<Integer> firstList= new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();

        //Generation random items in ArrayList's
        randomArrayList(firstList, 10, -10, 10);
        randomArrayList(secondList, 10, -10, 10);

        //Copy secondList in identicalList
        ArrayList<Integer> identicalList = new ArrayList<>(secondList);

        //Display firstList and secondList
        System.out.println("First list: " + firstList);
        System.out.println("Second list: " + secondList);

        //Function to find the same items
        identicalList.retainAll(firstList);

        //Display same items
        System.out.println("Identical list: " + identicalList);
    }

    /*Methods for generation random elements in ArrayList
    where:
    - list          - ArrayList, which will be filled
    - count         - how many items to add
     */
    public static ArrayList<Integer> randomArrayList(ArrayList<Integer> list, int count,
                                                     int startOfRange, int endOfRange){
        for(int i = 0; i < count; i ++){
            list.add((int)(Math.random()*(endOfRange-startOfRange))+startOfRange);
        }
        return list;
    }
}
