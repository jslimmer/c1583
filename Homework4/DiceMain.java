
import java.util.Scanner;
/*
 Assignment #4
 Jeremy Slimmer id#2132936
 CSCI 1583
 */

public class DiceMain {

    private static Dice dice;     //calling the dice class

    public static void main(String[] args) {//main


        int rollCount;    //used for tally of number of rolls
        int finalChoice = 1;
        int lastRoll =0;
        rollCount = 0;


        System.out.println("Please Enter the number of sides on the Die");
        Scanner in = new Scanner(System.in);
        int nsides = in.nextInt();

        do {
            dice = new Dice(nsides);
            lastRoll = dice.getDie1();
            System.out.println("The dice came up " + lastRoll);
            rollCount++;
            System.out.println("You have rolled " + rollCount + " times.");
            System.out.println("Do you wish to continue");
            System.out.println("Enter 1 for YES and 0 for NO");
            finalChoice = in.nextInt();


        } while (finalChoice == 1);



        System.out.println("Thank you for Playing");

    }
} 