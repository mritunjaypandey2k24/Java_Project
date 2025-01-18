package com.mritunjay.wordgame;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {

    private String wordToGuess;
    private char [] guessedLetters;
    private int attempts;


    public WordGuessGame(String [] wordList, int maxAttempts){

        Random rand = new Random();
        this.wordToGuess = wordList[rand.nextInt(wordList.length)];
        this.guessedLetters = new char[this.wordToGuess.length()];

        for(int i=0; i<this.guessedLetters.length;i++){
            this.guessedLetters[i] = '_';
        }
        this.attempts = maxAttempts;
    }

    public String play(){

        Scanner scanner = new Scanner(System.in);



        while(attempts>0  ){
            displayState();
            System.out.println("You have "+attempts+" attempts left...");
            System.out.println("Guess a letter: ");

            char ch = scanner.nextLine().toLowerCase().charAt(0);

            if(processGuess(ch)){
                System.out.println("Correct!");
                if(new String(guessedLetters).equals(wordToGuess)){
                    displayState();

                    System.out.println("You have guessed the word! You win!");
                    return "win";
                }
            }else{
                System.out.println("That guess was incorrect!");
                attempts--;
            }

        }
        return "loss";
    }

    private boolean processGuess(char letter){
        boolean letterFound = false;
        for(int i=0; i<wordToGuess.length();i++){
            if(wordToGuess.charAt(i)==letter){
                guessedLetters[i] = letter;
                letterFound = true;
            }
        }

        return letterFound;
    }

    private void displayState(){
        System.out.println("Guessed Letters: "+new String(guessedLetters));
    }
}
