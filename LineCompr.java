
import java.util.Scanner;

public class LineCompr {
	public static double lengthCalcu(int x1, int y1, int x2, int y2) {  //function to calculate length of line
		x2 = x2 - x1;
		y2 = y2 - y1;
		double length = Math.sqrt( x2*x2 + y2*y2 );
		return length;
}
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Double length[] = new Double[2];
		int x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);

		for (int i=0; i < 2; i++)
		{
			System.out.println("Enter cordinates for Line" + (i+1));
			System.out.println("Start points (x1,y1): ");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			System.out.println("End points (x2,y2): ");
			x2 = sc.nextInt();
			y2 = sc.nextInt();

			length[i] = lengthCalcu(x1, y1, x2, y2);
		}

		int check = length[0].compareTo(length[1]); //compareTo
		if (check == 0)
			System.out.println("Lines are equal");
		else if (check > 0)
			System.out.println("Line1 is larger than line2");
		else
			System.out.println("Line2 is larger than line1");
	}
}
