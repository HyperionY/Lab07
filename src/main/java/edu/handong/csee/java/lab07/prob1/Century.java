package edu.handong.csee.java.lab07.prob1;

public class Century {
	int year;

	public Century()
	{
	year = 0;	// set the variable year as 0
	}

	public Century(int year)
	{
	this.year = year;	// set the variable year as input year
	}

	public int calc_century()
	{
	if(year % 100 == 0)	// if year % 100 is 0, variable year as year / 100
	year = year / 100;
	else	// if year % 100 is not 0, variable year as year / 100 + 1
	{
	year = (year / 100) + 1;
	}
	return year;	// return the century
	}

}
