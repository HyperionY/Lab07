package edu.handong.csee.java.lab07.prob3;
import java.util.Random;

public class Attendance_main {
	public static void main(String[] args) {
		Attendance s_1 = new Attendance();	// set new Attendance as s_1
		Attendance s_2 = new Attendance();	// set new Attendance as s_2
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0);	// set new Attendance("Lucas", 1, "21833222", 0) as s_3
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);	// set new Attendance("Martha", 2, "21733444", 0) as s_3

		s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0);	// set the variable(name, year, student_id, missed) in s_1 as inputs
		s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);	// set the variable(name, year, student_id, missed) in s_2 as inputs

		Random randomGenerator = new Random();	//set new Random() as named randomGenerator

		s_1.set_missed(randomGenerator.nextInt(10));	//set variable missed in s_1 randomize
		s_2.set_missed(randomGenerator.nextInt(10));	//set variable missed in s_2 randomize
		s_3.set_missed(randomGenerator.nextInt(10));	//set variable missed in s_3 randomize
		s_4.set_missed(randomGenerator.nextInt(10));	//set variable missed in s_4 randomize

		if(s_1.get_missed() > 6)
		{
		System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");	// if s_1 missed > 6, print s_1 id and fail this course
		System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());	//and print name and missed
		}
		else
		System.out.println("We'll see about the grade, " + s_1.get_name());	// if not s_1 missed > 6, print s_1 id and We'll see about the grade
		if(s_2.get_missed() > 6)
		{
		System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");	// if s_2 missed > 6, print s_2 id and fail this course
		System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());	//and print name and missed
		}
		else
		System.out.println("We'll see about the grade, " + s_2.get_name());	// if not s_2 missed > 6, print s_2 id and We'll see about the grade
		if(s_3.get_missed() > 6)
		{
		System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");	// if s_3 missed > 6, print s_3 id and fail this course
		System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());	//and print name and missed
		}
		else
		System.out.println("We'll see about the grade, " + s_3.get_name());	// if not s_3 missed > 6, print s_3 id and We'll see about the grade
		if(s_4.get_missed() > 6)
		{
		System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");	// if s_4 missed > 6, print s_4 id and fail this course
		System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());	//and print name and missed
		}
		else
		System.out.println("We'll see about the grade, " + s_4.get_name());	// if not s_4 missed > 6, print s_4 id and We'll see about the grade
	}

}
