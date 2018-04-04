package edu.handong.csee.java.lab07.prob3;
import java.util.*; 

public class Attendance {
	private String name = "";	// set the variable name(type String) as ""
	private int year = 0;		// set the variable year(type int) as 0
	private String student_id = "";	// set the variable student_id(type String) as ""
	private int missed = 0;		// set the variable missed(type int) as 0

	//Constructors
	public Attendance()
	{
	this.name = "Null";	// if no value into Attendance(), set the variable name in class Attendance as NULL(no data)
	this.year = 0;		// if no value into Attendance(), set the variable year in class Attendance as 0
	this.student_id = "Null";	// if no value into Attendance(), set the variable student_id in class Attendance as NULL(no data)
	this.missed = 0;	// if no value into Attendance(), set the variable missed in class Attendance as 0
	}

	public Attendance(String name, int year, String student_id, int missed)
	{
	this.name = name;	// if value into Attendance(), set the variable name in class Attendance as input name
	this.year = year;	// if value into Attendance(), set the variable year in class Attendance as input year
	this.student_id = student_id;	// if value into Attendance(), set the variable student_id in class Attendance as input student_id
	this.missed = missed;	// if value into Attendance(), set the variable missed in class Attendance as input missed
	}

	//Getters
	public String get_name()
	{
	return name;	// return the value of name in class Attendance
	}
	public int get_year()
	{
	return year;	// return the value of year in class Attendance
	}

	public String get_id()
	{
	return student_id;	// return the value of year in class Attendance
	}
	public int get_missed()
	{
	return missed;	// return the value of missed in class Attendance
	}

	//Setters
	public void set_name(String name)
	{
	this.name = name;	// set the variable name in class Attendance as input name
	}
	public void set_year(int year)
	{
	this.year = year;	// set the variable year in class Attendance as input year
	}
	public void set_id(String student_id)
	{
	this.student_id = student_id;	// set the variable student_id in class Attendance as input student_id
	}
	public void set_missed(int missed)
	{
	this.missed = missed;	// set the variable missed in class Attendance as input missed
	}
}
