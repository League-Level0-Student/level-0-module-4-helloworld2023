package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String number = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(number);
		// Ask the user how many dimes they have, and convert their answer
String number2 = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
int dimes = Integer.parseInt(number2);
		// Calculate how much money the user has and save it in a double variable 
double first_number, second_number, answer ;
first_number = nickels;
second_number = dimes;
answer = first_number + second_number;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "The total amount of money you have is $" + answer);
	}
}

