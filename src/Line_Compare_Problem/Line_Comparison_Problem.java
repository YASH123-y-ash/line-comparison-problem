package Line_Compare_Problem;

public class Line_Comparison_Problem {

	public static void main(String[] args) {

		//Variables

		int x1,x2,y1,y2,x3,y3;
		int  line1,line2;

		//initialize value
		x1=2; y1=2;
		x2=4;y2=4;
		x3=5;y3=1;
		
		//computation of length of line
		line1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		line2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));

		//printing line1 and line2 value
		System.out.println("Lenth of Line 1 value =" +line1);
		System.out.println("Length od Line 2 value =" +line2);

		//creating a object of integer class
		Integer length1=new Integer(line1);
		Integer length2=new Integer(line2);

		// comparing the lines length using compareTo()
		int compare=length1.compareTo(length2);

		if(compare>0) {
			System.out.println("Line 1 is greater than Line 2");
		}else if(compare<0) {
			System.out.println("Line 1 is less than Line 2");
		}
		else
		{
			System.out.println("Line 1 is equal to Line 2");
		}	
	}
}
