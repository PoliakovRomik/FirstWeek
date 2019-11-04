package com.company;

import java.util.Scanner;

public class Game21 {
    public int currentCard;
    public int currentGamePoint;
    public int userButton;

    public int getCurrentCard(){
        return currentCard;
    }

    public void play(){
        currentGamePoint = 0;
        Scanner in = new Scanner(System.in);
        singleHandOutOfCards();
        do {
            singleHandOutOfCards();
            if(currentGamePoint > 21){
                System.out.println("You lose, because your combination more than 21 - " +
                        currentGamePoint);
                break;
            }
            System.out.println("Now your combination is: " + currentGamePoint);
            System.out.print("Give another card? \n Yes - 1, No - 0:");
            do {
                userButton = in.nextInt();
                if(userButton!=0 && userButton != 1) {
                    System.out.println("Incorrect input! Enter 1 or 0");
                }
            }while(userButton!=0 && userButton != 1);
        }while(userButton!=0);
    }

    public void singleHandOutOfCards(){
        getNextCard();
        currentGamePoint += getCurrentCard();
    }

    public void getNextCard(){
        do {
            currentCard = generationCard();
        }while(currentCard==5);
    }

    public int generationCard(){
        return (int)(Math.random()*(11-1))+1;
    }
}
