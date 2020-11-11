
//@author Jaycob Willis
import java.util.*;

public class Project3 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		//variables
		String yarn1;
		String yarn2;
		int yards1;
		int yards2;
		int numBalls1;
		int numBalls2;
		int targetYards;
		double temp;
//this is all of the output logic
		System.out.println("Enter the name of the yarn specified by your pattern.");
		yarn1 = stdin.nextLine();
		System.out.println("Enter the number of balls of " + yarn1 + " that are required.");
		numBalls1 = Integer.parseInt(stdin.nextLine());

		while (numBalls1 <= 0) {
			System.out.println("The number of balls must be positive. Please re-enter.");
			numBalls1 = Integer.parseInt(stdin.nextLine());
		}
		
		System.out.println("Enter the number of yards per ball of " + yarn1 + ".");
		yards1 = Integer.parseInt(stdin.nextLine());
		while(yards1 <= 0) {
			System.out.println("The number of yards must be positive. Please re-enter.");
			yards1 = Integer.parseInt(stdin.nextLine());
		}
		
		System.out.println("Enter the name of the substitute yarn.");
		yarn2 = stdin.nextLine();
		
		System.out.println("Enter the number of yards per ball of " + yarn2 + ".");
		yards2 = Integer.parseInt(stdin.nextLine());
		
		while(yards2 <= 0) {
			System.out.println("The number of yards must be positive. Please re-enter.");
			yards2 = Integer.parseInt(stdin.nextLine());
		}
		//calc for the number of balls needed
		targetYards = yards1 * numBalls1;
		temp = Math.round((targetYards / yards2));
		numBalls2 = (int)temp + 1;
		System.out.printf("You should purchase %d balls of %s instead of %d balls of %s.\n", numBalls2, yarn2, numBalls1, yarn1);
		
		
		
	}

}
