//This program that takes a number from the user and generates an integer between 1 and 7 and displays the name of the weekday written by Rutvi Miskin.

import java.util.Scanner;
public class Weekdays
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int day= in.nextInt();
		System.out.println(getDayName(day));
	}

	// Get the name for the week
	public static String getDayName(int day)
	{
		String days="";
		switch(day)
		{
			case 1: days = "Monday"; break;
			case 2: days = "Tuesday"; break;
			case 3: days = "Wednesday"; break;
			case 4: days = "Thurday"; break;
			case 5: days = "Friday"; break;
			case 6: days = "Saturday"; break;
			case 7: days = "Sunday"; break;
			default: days = "Invalid day range";
		}
		return days;
	}
}