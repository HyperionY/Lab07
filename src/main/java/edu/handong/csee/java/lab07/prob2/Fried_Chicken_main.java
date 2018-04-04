package edu.handong.csee.java.lab07.prob2;

public class Fried_Chicken_main {

	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);	// set the new Chicken("Cheese_mustard", 16000.00, 5) as named menu1
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);	// set the new Chicken("Honey_mustard", 16000.00, 5) as named menu2
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);	// set the new Chicken("Spicey_chicken", 16000.00, 1) as named menu3

		menu1.set_stars(3);	// variable stars in menu1 set the value as 3
		menu2.set_stars(4);	// variable stars in menu2 set the value as 4
		menu3.set_stars(1);	// variable stars in menu3 set the value as 1

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());	//print from console as menu1 chicken name and rating(stars)
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());	//print from console as menu2 chicken name and rating(stars)
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());	//print from console as menu3 chicken name and rating(stars)

	}

}
