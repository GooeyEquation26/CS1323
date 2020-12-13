/**
 *  @author Jaycob Willis
 *  12/12/2020
 *  STUDENT ID: 113525653
 *  
 *  This is a program giving an example of using outside classes
 *  and constructing objects with those classes.
 *  The Driver simply test the outside class "Triangle.java"
 * 
 */

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Triangle> list = new ArrayList<Triangle>();
		
		//creates 5 Triangle class objects, and gives them values
		Triangle t1 = new Triangle(1, 2, 3);
		Triangle t2 = new Triangle(2, 3, 4);
		Triangle t3 = new Triangle(3, 4, 5);
		Triangle t4 = new Triangle(4, 5, 6);
		Triangle t5 = new Triangle(5, 6, 7);
		
		//adds the 5 objects the arrayList list
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
		//displays list using the toSting() method defined in Triangle.java
		System.out.println("New objects\n" + list);
		
		//displays list using the accessor methods for each side
		System.out.println("\nUsing Accessors");
		for(Triangle t: list ) {
			System.out.println("Triangle: " + t.getSideA() + " " + t.getSideB() + " " + t.getSideC());
		}
		
		
		//the rest is changing each side in each object in order to test the mutators
		for(Triangle t: list ) {
			t.setSideA(10);
		}
		
		System.out.println("\nAfter Side A changed\n" + list);
		
		for(Triangle t: list ) {
			t.setSideB(10);
		}
		
		System.out.println("\nAfter Side B changed\n" + list);
		
		for(Triangle t: list ) {
			t.setSideC(10);
		}
		
		System.out.println("\nAfter Side C changed\n" + list);
		
	}
}
