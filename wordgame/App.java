package com.mritunjay.wordgame;

import java.util.Scanner;

public class App {

    public static void main(String [] args){

        String [] words = {"java","programming","class","computer","method"};

        Scanner sc = new Scanner(System.in);
        boolean shouldPlayAgain = false;
        int win =0;
        int losses = 0;

        do{
            WordGuessGame game = new WordGuessGame(words,10);
            String result = game.play();
            if(result.equals("win")){
                win++;
            }else{
                losses++;
            }

            System.out.println("Wins: "+win+" , Losses: "+losses);
            System.out.print("Would you like to play again? (y/n): ");
            char playAgain = sc.nextLine().toLowerCase().charAt(0);
            shouldPlayAgain = playAgain=='y';
        }while (shouldPlayAgain);




    }
}
