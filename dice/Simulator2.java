import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator2 {
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
                int [] rolledNumber = new int[numberOfDice];

                for (int i = 0; i < numberOfDice; i++) {
                    rolledNumber[i] = rand.nextInt(6) + 1;

                }
                display(rolledNumber);



            } catch (InputMismatchException e) {
                System.out.println("That is not a valid number!");
                scanner.next();
            }
        }while(!appCompleted);



    }

    static void display(int [] values){

        String [][] diceFaces = {
                {"---------","|       |","|   o   |","|       |","---------"},
                {"---------","| o     |","|       |","|     o |","---------"},
                {"---------","| o     |","|   o   |","|     o |","---------"},
                {"---------","| o   o |","|       |","| o   o |","---------"},
                {"---------","| o   o |","|   o   |","| o   o |","---------"},
                {"---------","| o   o |","| o   o |","| o   o |","---------"}
        };

        for(int i=0; i< 5;i++){ //5 rows in each dice faces
            for(int j=0; j<values.length;j++){
                System.out.print(diceFaces[values[j]-1][i] + "      ");
            }
            System.out.println();
        }


    }
}
