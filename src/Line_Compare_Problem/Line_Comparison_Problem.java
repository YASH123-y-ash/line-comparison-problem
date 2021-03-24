package Line_Compare_Problem;

public class Line_Comparison_Problem {

	public static void main(String[] args) {

		//Variables
		int x1,x2,y1,y2,x3,y3;
		int line1,line2;

		//initializing co-ordinates points
		x1=2; y1=2;
		x2=4;y2=4;
		x3=5;y3=1;

		line1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Line one value = " +line1);

		line2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		System.out.println("Line Two value = " +line2);

		////converting the double into string and store the value String variable
		String length1=String.valueOf(line1);
		String length2=String.valueOf(line2);

		//comparing to length if its  equal or Not
		System.out.println(length1.equals(length2));

	}
}
