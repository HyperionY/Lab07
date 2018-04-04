package edu.handong.csee.java.lab07.prob2;

public class Chicken {
	private String name;	//set variable name type as String
	private double price;	//set variable price type as double
	private int stars;		//set variable stars type as stars

	public Chicken()
	{
	this.name = "";		// if no value into Chicken(), set variable name as ""
	this.price = 0.0;	// if no value into Chicken(), set variable price as 0.0
	this.stars = 0;		// if no value into Chicken(), set variable stars as 0
	}

	public Chicken(String name, double price, int stars)
	{
	this.name = name;	// if values into Chicken(), set variable name as input name
	this.price = price;	// if values into Chicken(), set variable price as input price
	this.stars = stars;	// if values into Chicken(), set variable stars as input stars
	}

	public String get_name()
	{
	return this.name;	// return value of name
	}

	public double get_price()
	{
	return this.price;	// return value of price
	}

	public int get_stars()
	{
	return this.stars;	// return value of stars
	}

	public void set_name(String name)
	{
	this.name = name;	// if input the values, set variable name as input name
	}

	public void set_price(double price)
	{
	this.price = price;	// if input the values, set variable price as input price
	}

	public void set_stars(int stars)
	{
	this.stars = stars;	// if input the values, set variable stars as input stars
	}
}
