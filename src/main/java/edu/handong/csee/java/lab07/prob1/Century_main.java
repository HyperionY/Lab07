package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;	// import the library java.util.Scanner
	
public class Century_main {

	public static void main(String[] args) {
		int yr = 0;	// set the variable yr as 0
		Scanner keyboard = new Scanner(System.in);	// set the Scnner as named keyboard

		System.out.println("Input year: ");	//print from console as "Input Year: "
		yr = keyboard.nextInt();	// input the int value into yr

		Century year = new Century(yr);	// set new Century(yr) as year
		System.out.println(yr + " is " + year.calc_century() + "th century.");	// print from console the result of century
	}
}
