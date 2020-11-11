//@author Jaycob Willis
//Psychology test
import java.util.*;
public class Project4 {
	public static void main(String[] args) {
		//variables
		int accumulator = 0;
		Scanner stdin = new Scanner(System.in);
		String input = "";
		//question 1
		System.out.println("Answer yes or no to the following questions\n"
				 + "I am losing my sense of humor.");
		input = stdin.nextLine();
		accumulator = increment(accumulator, input);
		input = "";
		//question 2
		System.out.println("I find it more and more difficult to see people socially.");
		input = stdin.nextLine();
		accumulator = increment(accumulator, input);
		input = "";
		//question 3
		System.out.println("I feel tired most of the time.");
		input = stdin.nextLine();
		accumulator = increment(accumulator, input);
		input = "";
		
		verdict(accumulator);
	}
	//adds 1 to sum when needed
	public static int increment(int sum, String in) {
		if(in.equalsIgnoreCase("yes")) {
			sum = sum + 1;
		} 
		return sum;
	}
	//calculates the final score of the quiz
	public static void verdict(int sum) {
		if(sum != 0) {
			if(sum == 3) {
				System.out.println("You're probably stressed out");
			}else if(sum == 2) {
				System.out.println("You're possibly stressed out");
			}else if(sum == 1) {
				System.out.println("You're beginning to stress out");
			}
		}else {
			System.out.println("You're more exhausted than stressed out");
		}
	}
}
