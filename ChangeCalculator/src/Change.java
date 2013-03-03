
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**by Jeremy Slimmer id#2132936
 * CSCI 1583 Assignment 3
 *
 * @author jeremyslimmer
 */
public class Change{
    private static ChangeCalculator calc;
    
    
public static void main(String[] args) {
        //read info from user without decimal
    
        System.out.println("How much change?:");
        System.out.println("Please enter the amount without the decimal point!!!");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Your input is " + num + ".");
        calc=new ChangeCalculator(num);
        //sending input to other class for calculation
        System.out.println("The # of Quarters is : " + calc.getNumQuarters() + ".");
        System.out.println("The # of Dimes is :" +calc.getNumDimes()+". ");
        System.out.println("The # of Nickels is :"+calc.getNumNickels()+". ");
        System.out.println("The # of Pennies is :"+calc.getNumPennies()+". ");
        //Returing output to display

}


        
}




   
