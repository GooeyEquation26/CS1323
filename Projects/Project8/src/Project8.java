import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
//@Author Jaycob Willis
//Simple program to find the most frequent movie title in a txt file
//CS-1323
public class Project8
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//Method calls
		String[] file = readFile("movie-data.txt");
		lowercase(file);
		String mostPopular = findMostFrequent(file);
		
		//Output after methods
		System.out.println("Most popular movie: " + mostPopular);
	}

	//reads file and places each line in an element of the array
	public static String[] readFile(String filename) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File(filename));
		int count = 0;
		//counting the number of lines
		while(file.hasNextLine()) {
			file.nextLine();
			count++;
		}
		String[] fileContents = new String[count];
		
		file.close();
		//setting elements of the array
		Scanner fileReadTwo = new Scanner(new File(filename));
		for(int i = 0;i < count;i++){
			fileContents[i] = fileReadTwo.nextLine();
		}
		
		fileReadTwo.close();
		//sorts the array
		Arrays.sort(fileContents);
		//@return
		return fileContents;
	}

	//simple for loop to convert each element to lower case
	public static void lowercase(String[] array)
	{
		for(int i = 0;i < array.length;i++) {
			array[i] = array[i].toLowerCase();	
		}
	}
	
	//goes through the sorted array comparing the current line to the last
	//if they are the same then it adds one to the count
	//if the count it is bigger than the max then it becomes the max
	public static String findMostFrequent(String[] array)
	{
		int count = 0;
		int max = 0;
		String current = "";
		String last = "";
		String most = "";
		
		for(int i = 0;i < array.length;i++) {
			current = array[i];
			if(current == last) {
				count++;
			}else {
				count = 1;
			}
			if(count > max) {
				most = current;
				max = count;
			}
			last = current;
		}
		//@return
		return most;
	}
}