package changeMaker;

import java.util.Scanner;
/**
 * The changeMaker program takes input from the user in the form of a number 1-99 in us cents format. 
 * The result that is displayed will break down the total cents into individual coins of the four main coin denominations
 * and display the result.
 * 
 * 
 * @author Ryan Chapin
 * @version 1.0
 * @since 2020-09-29
 *
 */

public class ChangeMaker{
	/**
	 * This is the main method which uses the changeMaker method in conjunction
	 * with the scanner object to receive input from the user and display the result
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompting user to input change
		System.out.println("Welcome to Change Maker");
		System.out.print("Please enter your cents to be returned: ");
		int cents = input.nextInt();
		System.out.print("\n" + "You entered " + cents + "¢ cents" + "\n");
		
		changeMaker(cents);
		

	}
	/**
	 * This method uses integers based on us coin denominations and breaks them down into their individual denominations
	 * based on the specified user input placed in the cents variable. By using logic statements, we can find if a denomination is needed
	 * and will display the amount needed to return to the user for each coin.
	 * 
	 *  
	 * @param cents is based on the user input taken from scanner object in the main method
	 * @param numQuarter, numDime, numNickel & numPenny are the individual coin denominations to be broken down and displayed only if they are needed
	 * @param cal is used to calculate each denomination from the previous higher value after each logic statement
	 * 
	 */
	public static void changeMaker(int cents) {
		//declaring the variables
		int numQuarter = 0;
		int numDime = 0;
		int numNickel = 0;
		int numPenny = 0;
		//making a calculation variable
		int cal = cents; //calculation variable
		//logic statement to calculate how many quarters
		if(cents >= 25 && cents <= 99) {
			numQuarter = cents / 25;
			System.out.println("\n" + "Number of quarters: " + numQuarter);
			cal = cents - (25 * numQuarter); //calculate leftover cents after quarters
		}
		//logic statement to calculate how many dimes
		if(cal >= 10 && cents <= 99) {
			numDime = cal / 10;
			System.out.println("\n" + "Number of dimes: " + numDime);
			cal = cal - (10 * numDime); //calculate leftover cents after dimes
		}
		//logic statement to calculate how many nickels
		if(cal >= 5 && cents <= 99) {
			numNickel = cal / 5;
			System.out.println("\n" + "Number of nickels: " + numNickel);
			cal = cal - (5 * numNickel); //calculate leftover cents after nickels
		}
		//logic statement to calculate how many pennies
		if(cal >= 1 && cents <= 99) {
			numPenny = cal / 1;
			System.out.println("\n" + "Number of pennys: " + numPenny);
		}
		//if value is over 99 telling user its not correct
		else if(cents >= 99) {
			System.out.println("Value not correct, please enter again");
			
		}
			
	}
	

}
