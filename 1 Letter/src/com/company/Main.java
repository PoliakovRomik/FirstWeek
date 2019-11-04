package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        int count;
        boolean state;
        char userSymbols;
        int indexOfPrescribedSymbol;
        indexOfPrescribedSymbol = generationRandomNumber();
        count = 0;
        do {
            userSymbols = EnterSymbol();
            if(Alphabet.contains(Character.toString(userSymbols))) {
                state = gameLogic(userSymbols, indexOfPrescribedSymbol);
                count++;
            }
            else {
                System.out.println("Incorrect input! You must enter characters from the Latin alphabet");
                state = false;
            }
        } while (state == false);
        System.out.println("You have used " + count + " attempts");
    }

    public static boolean correctInput(char symbol){
        if(Alphabet.contains(Character.toString(symbol))){

        }
        return true;
    }

    public static boolean gameLogic(char userSymbols, int indexOfPrescribedSymbol){
        if (Alphabet.indexOf(userSymbols) < indexOfPrescribedSymbol) {
            System.out.println("Too low! Try again");
        } else if (Alphabet.indexOf(userSymbols) > indexOfPrescribedSymbol) {
            System.out.println("Too high! Try again");
        } else {
            System.out.println("\nYou guessed the symbol! It's: "
                    + Alphabet.charAt(indexOfPrescribedSymbol));
            return true;
        }
        return false;
    }

    public static int generationRandomNumber(){
        return (int)(Math.random()*25);
    }

    public static char EnterSymbol(){
        System.out.print(Alphabet +
                "\nEnter the Latin alphabet symbol, from the list above:");
        Scanner in = new Scanner(System.in);
        return Character.toUpperCase(in.next().charAt(0));
    }
}
