package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String text = "Some text with different CaSe,., Java it's good";
        text = text.toUpperCase();
        find(text);
    }

    public static void find(String text){

        ArrayList<Character> alphabet = new ArrayList<Character>();
        ArrayList<Integer> countSymbol = new ArrayList<Integer>();

        for(int i = 0; i < text.length(); i++){
        char currentSymbol = text.charAt(i);
        int index = alphabet.indexOf(currentSymbol);
            if(index == -1){
                alphabet.add(currentSymbol);
                countSymbol.add(1);
            }
            else{
                countSymbol.set(index, (countSymbol.get(index) + 1));
            }
        }
        int maxCount;
        maxCount = Collections.max(countSymbol);

        System.out.println("Most common symbol is: \"" +
                alphabet.get(countSymbol.indexOf(maxCount))+ "\" it is reused " +
                maxCount + " times.");
        System.out.println("These are all characters and the number of their uses in the text: \n" +
                alphabet + "\n" + countSymbol);
    }

}
