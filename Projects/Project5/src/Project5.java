
//@author Jaycob Willis
import java.util.*;

public class Project5 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		//accumulators
		int acc1 = 0, acc2 = 0, acc3 = 0, acc4 = 0, acc5 = 0;
		
		//change variables
		int positiveChanges = 0, negativeChanges = 0, noChanges = 0;
		
		//settings variable
		int currentSetting = 0, previousSetting = 0;
		
		//loop variable
		int x = 3;
		
		//initial print that doesnt need to be looped
		System.out.println("Response Dial Simulator" + "\n-----------------------\n" + "Initial setting: " + x);

		//sentinel for loop
		for (; x > -1;) {
			
			//previous number
			previousSetting = x;
			
			//retrieves input
			System.out.println("Enter the next setting (1-5) or -1 to stop.");
			x = stdin.nextInt();
			
			//current number
			currentSetting = x;
			if (x == 1) {
				acc1 += 1;
			} else if (x == 2) {
				acc2 += 1;
			} else if (x == 3) {
				acc3 += 1;
			} else if (x == 4) {
				acc4 += 1;
			} else if (x == 5) {
				acc5 += 1;
			}
			
			//tester for the positive, negative, and no change
			if (currentSetting != -1) {
				if (currentSetting > previousSetting) {
					positiveChanges += 1;
					System.out.println("Positive change: " + previousSetting + " to " + currentSetting);
					System.out.println("Current setting: " + currentSetting);
				} else if (currentSetting < previousSetting) {
					negativeChanges += 1;
					System.out.println("Negative change: " + previousSetting + " to " + currentSetting);
					System.out.println("Current setting: " + currentSetting);
				} else if (currentSetting == previousSetting) {
					noChanges += 1;
					System.out.println("No change: " + previousSetting + " to " + currentSetting);
					System.out.println("Current setting: " + currentSetting);
				}
			}
		}
		
		//response summary
		System.out.print("Response Summary"
		+ "\n----------------\n"
		+ "1 was chosen " + acc1 + " time(s).\n"
		+ "2 was chosen " + acc2 + " time(s).\n"
		+ "3 was chosen " + acc3 + " time(s).\n"
		+ "4 was chosen " + acc4 + " time(s).\n"
		+ "5 was chosen " + acc5 + " time(s).\n\n"
		+ "Positive changes: " + positiveChanges + "\n"
		+ "Negative changes: " + negativeChanges + "\n"
		+ "No changes: " + noChanges);
	
	}
}
