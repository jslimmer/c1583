/*
 Assignment #4
 Jeremy Slimmer id#2132936
 CSCI 1583
 */

import java.util.Random;
 class Dice {

    int num_sides;
    private int die1;

    public Dice(int nosides) {
        this.num_sides = nosides;
        //takes the number of sidess variable from the main
         roll();
    }

    public int roll() {
        /* i know this looks strange... I was unable to get the Gaussian
         * to work correctly.  However i found that i could psuedo simulate it
         * with the use of a for loop this uses averages taken over a course
         * of iterations using the number of sides as a control. I know its not 
         * exact but it works. But i did found with die with about 8 sides or
         * less it would have issues and you would likely get what the average 
         * between min and max sides were. I know this isn't perfect but its 
         * a macguyverism.
         */ 
        int result = 0;
        if (num_sides > 10) {
            for (int count = 0; count < num_sides; count++) {
                result += (int) (Math.random() * num_sides) + 1;
                die1 = result / num_sides;
            }
        } else {
            die1 = (int) (Math.random() * num_sides) + 1;

        }


        return die1;
        //send die back to the main 

    }

    public int getDie1() {

        return die1;
    }
}
