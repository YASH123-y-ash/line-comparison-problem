package com.linecomparisionproblem;


public class LineComparisionProblem {

	public static void main(String[] args) {

		//Variables
		int x1=7;
		int x2=2;
		int y1=12;
		int y2=10;

		//calculating length of line base on co-ordinates points
		int	lenght=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

		//print Length of line
		System.out.println("Length of Line is "+ lenght);

	}
}
