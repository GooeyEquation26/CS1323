//Jaycob Willis
public class Project2 {
	public static void main(String[] args) {
		//a ridiculous amount of variables, probably should have used an array
		final double SALES_TAX = .0875;//decimal instead of percentage
		String bookOne = "Percy Jackson, Rick Riordan";
		String bookTwo = "Divergent, Veronica Roth";
		String bookThree = "Goosebumps, R.L. Stein";
		double costOne = 23.50;
		double costTwo = 12.50;
		double costThree = 11.75;
		int numCopiesOne = 4;
		int numCopiesTwo = 3;
		int numCopiesThree = 4;
		double totalBeforeTax = 0;
		double amountOfTax = 0;
		double total;
		//This is the math to calculate all of the totals
		totalBeforeTax = ((costOne * numCopiesOne) + (costTwo * numCopiesTwo) + (costThree * numCopiesThree));
		amountOfTax = totalBeforeTax * SALES_TAX;
		total = totalBeforeTax + amountOfTax;
		//This is the output portion of the code pretty simple
		//I chose to use printf instead of formatting the strings seperately
		System.out.printf("Purchase %d copies of %s. Each copy costs $%.2f.\n",numCopiesOne, bookOne, costOne);
		System.out.printf("Purchase %d copies of %s. Each copy costs $%.2f.\n",numCopiesTwo, bookTwo, costTwo);
		System.out.printf("Purchase %d copies of %s. Each copy costs $%.2f.\n",numCopiesThree, bookThree, costThree);
		System.out.printf("Total before tax: $%.2f\n", totalBeforeTax);
		System.out.printf("Sales tax: $%.2f\n", amountOfTax);
		System.out.printf("The total cost of your order will be $%.2f", total);
	}
}
