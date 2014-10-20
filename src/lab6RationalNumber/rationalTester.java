package lab6RationalNumber;

import java.util.Scanner;

/*
 * Definition as found on blackboard:
 * Write and fully test a class that represents rational numbers. 
 * A rational number can be represented as the ratio of two integer values, a and b, where b is not zero.
 * The class has attributes for the numerator and denominator of this ratio.
 * The ratio should always be stored in its simplest form.
 * That is, any common factor of a and b should be removed.
 * For example, the rational number 40/12 should be stored as 10/3. 
 * The class has the following constructors and methods: 
 * • A default constructor that sets the rational number to 0/1.
 * • A constructor that has parameters for the numerator and denominator, and converts the resulting ratio to simplified form.
 * • A set method that sets the numerator and denominator. 
 * • simplify—a private method that converts the rational number to simplified form. 
 * • getGCD(x, y)—a private static method that returns the largest common factor of the two positive integers x and y, that is, their greatest common divisor. 
 *   For example, the greatest common divisor of 40 and 12 is 4. 
 * • getValue—returns the rational number as a double value. 
 * • toString—returns the rational number as a string in the form a/b. 
 * 
 * Write a test program that tests each method.
 * In addition allow the user to choose the numerator and denominator. 
 * To avoid your program from crashing when the user does not type an integer for the numerator or denominator, 
 * read the input from the user as a string, 
 * check whether the user entered an integer and then convert the string to an integer. 
 */
public class rationalTester {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Its testing time :)");
		RationalNumber test = new RationalNumber();
		System.out.println("Let us see what is stored right at the beginning:");
		System.out.println(test.toString());
		System.out.println("Whop that is what we expect\n");
		System.out.println("Now lets give it some variables... lets try 40 and 12");
		test.setRatio(40, 12);
		System.out.println("Now what is stored?");
		System.out.println(test.toString());
		System.out.println("Hey this is not what we put in...");
		System.out.println("Or is it? we need to think about this...");
		System.out.println("Okay 40 became 10... that means it was devided by 4...");
		System.out.println("And if I would devide 12 by 4 that would get me 3, what was it that was stored already?");
		System.out.println(test.toString());
		System.out.println("Aaaah so it does work, it just simplifies it directly");
		System.out.println("");
		System.out.println("Now we will see what happens when we tell it to return a double value");
		System.out.println("Lets start simple, 5/10 should give is a double value of 0.5");
		test.setRatio(5, 10);
		System.out.println("The double value given by the program is: " + test.getValue());
		System.out.println("That is what we suspect, now lets try a harder number.");
		System.out.println("We know that 1/3 will go up to infinity, lets see what happens when we get a double estimate of that.");
		test.setRatio(1, 3);
		System.out.println("The double value given by the program is: " + test.getValue());
		System.out.println("Well it gave a good enough approximation I guess...");
		System.out.println("The whole idea behind this class is that we can store these kind of fraction, and not the estimates of them.");
		System.out.println();
		System.out.println("So far we know that the program works, I will now allow you to enter some numbers, go mad with them.");
		boolean temp = true;
		while (temp) {
			int numerator = 0, denominator = 0;
			boolean tempNum = true;
			while(tempNum){
				
				System.out.println("You can stop this program at any time by tying in stop.");
				System.out.println("Please give me the number you want to enter as a numerator:");
				String numeratortemp = keyboard.next();
				if (isStop(numeratortemp)){
					System.out.println("You indicated that you want to stop the program.");
					System.out.println("Terminating program.");
					keyboard.close();
					System.exit(0);
				}else if (isInt(numeratortemp)){
					numerator = Integer.parseInt(numeratortemp);
					tempNum=false;
				}else{
					System.out.println("Incorrect input, try again.");
				}
			}
			boolean tempDen = true;
			while(tempDen){
				System.out.println("Please give me the number you want to enter as a denominator:");
				String denominatortemp = keyboard.next();
				if (isStop(denominatortemp)){
					System.out.println("You indicated that you want to stop the program.");
					System.out.println("Terminating program.");
					keyboard.close();
					System.exit(0);
				}else if (isInt(denominatortemp)){
					denominator = Integer.parseInt(denominatortemp);
					if (denominator==0){
						System.err.println("You cannot devide through 0....");
						System.out.println("Try again.");
					}else{
						tempDen=false;
					}
				}else{
					System.out.println("Incorrect input, try again.");
				}
			}
			System.out.println();
			System.out.println("You entered the number " + numerator + " as numerator.");
			System.out.println("And you said you wanted " + denominator + " to be the denominator.");
			System.out.print("This is stored as ");
			test.setRatio(numerator, denominator);
			System.out.println(test.toString() + " .");
		}

	}

	/**
	 * Returns a true if the input string is "stop"
	 * @param input the string to compare
	 * @return the result of the method
	 */
	private static boolean isStop(String input) {
		if (input.equalsIgnoreCase("stop")){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * Returns true if the input is a valid int.
	 * This will return false for any double of floating point inputs.
	 * It will return true for both positive and negative digits, not taking into account the size of the int.
	 * @param input
	 * @return
	 */
	private static boolean isInt(String input){
		int i =0;
		if (input.isEmpty()){
			return true;
		}
		if (input.charAt(i)=='-'){
			if (input.length()==1){
				return false;
			}else{
				i++;
			}
		}
		while (i<input.length()){
			if (Character.isDigit(input.charAt(i))){
				i++;
			}else{
				return false;
			}
		}
		return true;
	}

}
