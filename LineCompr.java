
import java.util.Scanner;

public class LineCompr {

	public LineCompr() {

		System.out.println("Welcome to Line Comparison Computation Program");
	}

	public double takeInput(int j) {				//method to take input from the user

		int x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cordinates for Line" + (j+1));
		System.out.println("Start points (x1,y1): ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("End points (x2,y2): ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		return lengthCalcu(x1, y1, x2, y2);
	}

	public double lengthCalcu(int x1, int y1, int x2, int y2) {	//method to calculate length of line
		x2 = x2 - x1;
		y2 = y2 - y1;
		return Math.sqrt( x2*x2 + y2*y2 );
	}

	public static void main(String args[]) {

		LineCompr line = new LineCompr();
		Double length[] = new Double[2];

		for (int i=0; i < 2; i++) {
			length[i] = line.takeInput(i);
		}

		int check = length[0].compareTo(length[1]);		//compareTo
		if (check == 0)
			System.out.println("Lines are equal");
		else if (check > 0)
			System.out.println("Line1 is larger than line2");
		else
			System.out.println("Line2 is larger than line1");
	}
}
