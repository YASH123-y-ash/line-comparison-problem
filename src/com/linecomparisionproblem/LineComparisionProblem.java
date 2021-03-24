package com.linecomparisionproblem;

public class LineComparisionProblem {

	public static void main(String[] args) {

		//Variables
		int x1 = 10;
		int x2 = 28;
		int y1 = 12;
		int y2 = 26;
		int x3 = 22;
		int y3 = 16;

		//computation of length of line
		int line1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		int line2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));

		//printing line1 and line2 value
		System.out.println("Lenth of Line 1 is =" +line1);
		System.out.println("Length od Line 2 is =" +line2);

		//creating a object of integer class
		Integer length1=new Integer(line1);
		Integer length2=new Integer(line2);

		//comparing the lines length using compareTo()
		int compare=length1.compareTo(length2);

		if(compare > 0) 
		{
			System.out.println("Line 1 is greater than Line 2");
		}
		else if(compare < 0) 
		{
			System.out.println("Line 1 is less than Line 2");
		}
		else
		{
			System.out.println("Line 1 is equal to Line 2");
		}	

	}

}
