package operators;

import java.util.Scanner;

public class Arithmeticoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,results; // We assign variable a,b, and results of datatype Integer , we can use any variable name for datatype
		Scanner scanner = new Scanner(System.in); // Using this for take input from keyboard
		System.out.println("Enter Value a and b");
		a = scanner.nextInt(); // we use nextInt method for coverging 
		b = scanner.nextInt(); // we use nexInt method for coverging
		
		results = a % b; // we can use arithmetic operators such as Additonal, Sub, Divid, Remain
		System.out.println("Results > " + results);  // results is the variable of Int data type
	}

}
