package com.linecomparisionproblem;

public class LineComparisionProblem {
	public static void main(String[] args) {

		//Variables
		int x1 = 10;
		int x2 = 20;
		int y1 = 30;
		int y2 = 40;
		int x3 = 50;
		int y3 = 60;
		int line1,line2;

		line1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Line one value = " +line1);

		line2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		System.out.println("Line Two value = " +line2);

		////converting the double into string and store the value String variable
		String length1=String.valueOf(line1);
		String length2=String.valueOf(line2);

		//comparing to length if its  equal or Not using .equals()
		boolean b = (length1.equals(length2));

		if(b == true)
		{
			System.out.println("line1 is greater");
		}
		else
		{
			System.out.println("line2 is greater");
		}

	}
}
