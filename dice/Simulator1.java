package com.mritunjay.dice;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator1 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        boolean appCompleted = false;
        do{
            try {
                System.out.println("How many dice would you like to roll");
                int numberOfDice = scanner.nextInt();

                appCompleted = true;

                System.out.println("About to roll " + numberOfDice + " dice");

                Random rand = new Random();

                for (int i = 0; i < numberOfDice; i++) {
                    int rolledNumber = rand.nextInt(6) + 1;
                    System.out.println(display(rolledNumber ));


                }



            } catch (InputMismatchException e) {
                System.out.println("That is not a valid number!");
                scanner.next();
            }
        }while(!appCompleted);



    }

    static String display(int value){

        return switch(value){

            case 1->  "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2->  "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3-> "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4-> "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5-> "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6-> "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default-> "Not a valid die value";


        };

    }
}
