package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> food = new ArrayList<String>();
		//2. Add five Strings to your list
		food.add("Taco");
		food.add("Ramen");
		food.add("Sushi");
		food.add("Nachos");
		food.add("Pizza");
		//3. Print all the Strings using a standard for-loop
//		for (int i = 0; i < food.size(); i++) {
//			String f=food.get(i);
//			System.out.println(" String at element " +i+" " + f );
//			
//		}
//		for (int i = 0; i < food.size(); i+=2) {
//			String f=food.get(i);
//			System.out.println(f);
//		}
//		for (int i = food.size()-1; i > -1; i--) {
//			String f=food.get(i);
//			System.out.println(f);
//		}
//		
		
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
	
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < food.size(); i++) {
			String f=food.get(i);
			if (f.contains("e")) {
			System.out.println(f);
		}
			
		}
		
	}
}
