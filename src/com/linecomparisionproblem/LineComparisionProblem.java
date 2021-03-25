package com.linecomparisionproblem;

/*
 program to compare two lines using compareTo()
 and .equals() in object oriented programming concepts 
 */
public class LineComparisionProblem {
	
	//static global variable 
	public static int x1 = 12; 
	public static int y1 = 16;
	public static int x2 = 10;
	public static int y2 = 45;
	public static int x3 = 98;
	public static int y3 = 110;

	// create function for equal() to compare two lines
	public static boolean equalMethod() 
	{
		//calculating length of a line
		int line1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		int line2 = (int) Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

		// converting the integer value into string
		String s2 = String.valueOf(line2);
		String s1 = String.valueOf(line1);

		// checking lines are equal or not using .equals()
		boolean b1=(s1.equals(s2));

		if(b1 == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// create function for CompareTo() to compare two lines
	public static void compareToMethod() 
	{

		// calculate of length of line
		int line1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		int line2 = (int) Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

		// print line 1 and line 2 value
		System.out.println("Line1  Length = " + line1);
		System.out.println("Line2  Length = " + line2);

		// creating a object of integer class
		Integer a = new Integer(line1);
		Integer b = new Integer(line2);

		// comparing the lines length using compareTo() method
		int compare = a.compareTo(b);

		// checking lines are equal,greater or smaller than one another
		if (compare > 0)
		{
			System.out.println("line1 is greater than line");
		}
		else if (compare < 0) 
		{
			System.out.println("line1 is less than line2");
		} else
		{
			System.out.println("line1 is equal to line2");
		}
	}

	public static void main(String[] args) {

		// function calling
		compareToMethod();
		boolean b2 = equalMethod();
		if(b2 == true)
		{
			System.out.println("line1 is greater than line2");
		}
		else
		{
			System.out.println("linne2 is greater than line1");
		}
	}

}
