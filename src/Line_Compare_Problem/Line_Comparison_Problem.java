package Line_Compare_Problem;

public class Line_Comparison_Problem {

	public static void main(String[] args) {

		//Variables
		int x1,x2,y1,y2;
		int  line1;
		//Taking Input
		x1=2; y1=2;
		x2=4;y2=4;

		line1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		//print Length of line
		System.out.println("Length of Line is "+ line1);

	}
}
