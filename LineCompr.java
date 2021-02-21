
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
		double length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cordinates of start point: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter cordinates of end point: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		length = lengthCalcu(x1, y1, x2, y2);
		System.out.println("Length of the line: " + length);
	}
}
