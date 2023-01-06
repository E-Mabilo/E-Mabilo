
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import thisJavaArray.Array;

public class DataStructuresVOne {
	
//	public static void main(String[] args) {
//		
//		//To declare an array you specify its type first. e.g int, string, short , etc.
//		//Arrays can e declared either way as shown below. Square brackets next to the type or the square brackets next to the variable name
//		
////		int[] numbers = new int[3]; 		//3 is the array size 
//		int[] numbers = { 10, 20, 30 }; // declare and assign 
//		
//		//Insert the values of the array by using the index of the array 
//		numbers[0] = 10;
//		numbers[1] = 20;
//		numbers[2] = 30;
	
//		0,1,2 are index 
	
//		//to print the content of the array we use the java array class e.g Array.toString()
//		System.out.println(Arrays.toString(numbers));
//		
//		
//		
//	}
	
	

	public static void main(String[] args) {
		// dynamic arrays. Adding and removing items is possible 
		// create a new array object 
	
		/*int voidIt = 2;
		voidIt ++; 
		int save = 5;
		String names = "esther";
		
		Point pointA =new Point(10, 20); //x:10 y:20
		
		System.out.println(pointA);
		System.out.println(names);
		*/
//		int[] numbers = new int[3];
//		numbers[0] = 2;
//		numbers[1] = 4;
//		numbers[2] = 6;
//		
//		String[] names = {"esther", "prince", "thandi", "mami"};
//		
//		for (String name: names) {
//			System.out.println((name));
//		}
//		
//		//Forward display using for loop 
//		for (int i = 0; i < names.length; i++ ) {
//			System.out.println((names[i]));
//		}
//		
//		
//		//Reverse display using for loop 
//		for (int i = names.length - 1; i > 0; i -- ) {
//			System.out.println((names[i]));
//		}
////	
//		System.out.println(Arrays.toString(names));
//		int x, y, z;
//		x =-14;
//		z=-3; 
//		y=5;
//		int r =x%z;
//		System.out.println(r);
//		if(x>5 ){
//	System.out.println("true");
//	
//		}	else
//		{System.out.println("false");}
		
		
		// Objects/referencing a class name to create a new reference object called alex from the static class Person "NAME"
//		Person alex = new Person();
//		
//		Person alexer = alex ;
//		
//		System.out.println("alexer's name is:  " + alexer.name);
//		
//	}
	
	// Objects/referencing a class name to create a new reference object called alex from the static class Person "NAME"
//	static class Person{
//		String name = "me";
//		void me(String name){
//			this.name = name;
//		}
//		int[] numbers = new int[3];
//		numbers[0] = 2;
//		numbers[1] = 4;
//		numbers[2] = 6;
//		System.out.println(Arrays.toString(numbers));
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(i);
//		}
		
		
		//To reverse a string in Java
//		String name = "Thandiwe";
		//Convert the string to a character array using the toCharArray() method.
//		char[] charArray = name.toCharArray();
		//create a variable to store the reversed name from the loop
//		String reversed = "";
		//Use a loop to iterate through the array, starting from the last element and ending at the first element.
//		for (int i = charArray.length - 1; i >= 0; i--) {
			// code to reverse the string goes here
			//inside the loop, append each character to a new string using the += operator.
//		    reversed += charArray[i];
//		}
//		System.out.println(reversed); // prints "ewidnahT"
  
		
		//Alternatively, you can also use the StringBuilder class to reverse the string.
		/*String name = "Thandiwe";
		StringBuilder sb = new StringBuilder(name);
		String reversed = sb.reverse().toString();
		System.out.println(reversed); // prints "ewidnahT" */ 
		
		
		
		/*Scanner class 
		 * Allows to take user input from the console 
		 * Takes the user name and prints "Hello Esther"
		*/
//		Scanner userName = new Scanner(System.in);
//		System.out.println( "Please enter your name ");
//		String str = userName.nextLine();
//		System.out.println(str + " is my name" );
//		
//		
		/*Methods 
		is a block of code.Which only runs if its called 
		Types of method:
		*  Build in methods -> these are methods provided by the java run time environment 
		*  User predefined methods -> Methods built by the users 
		*/
		
		
		/*Find the total number of size each char appearing inside the array  
		 * Declare the array 
		 * create a loop to run through the array 
		 * create a count to count increment the indexes in an array 
		 * check if the index value is equals to the 
		 */
//		char[] letters = {'A', 'B', 'C', 'D', 'D', 'D'};
		int count = occur();
		System.out.println(count);
	}
	
//	public static int countOcurrences(char[] letters, char searchLetter) {
////		System.out.println(Arrays.toString(letters));
////		System.out.println(searchLetter);
//		int count = 0;
//		for(char letter: letters) {
//			if (letter == searchLetter) {
//				count++;
//			}
//		
//		}
//		return count;
//	}
	
	public static int occur() {
		
		int count = 0;
		Scanner letterComp = new Scanner(System.in);
		System.out.println("Please enter a char: ");
		String letterComparing = letterComp.nextLine();
		
//		char letterComparing  = 'A';
		char[] lettersInMainMethod =  {'A', 'B', 'C', 'D', 'D', 'D'};
		for(char objectLetters : lettersInMainMethod) {
			if(charAt(letterComparing) == objectLetters) {
				count++;	
			}
		}
		
		return count;
		
	}

private static char charAt(String letterComparing) {
	// TODO Auto-generated method stub
	return 0;
}

}