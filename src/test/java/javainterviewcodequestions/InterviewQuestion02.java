package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion02 {

	//Write a Java Program to swap two numbers
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers to swap");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		scan.close();

		System.out.println("Before swapping: " + n1 + " - " + n2);
		
//		//1.Way: Use 3rd variable
//		double temp = n1;
//		n1 = n2;
//		n2 = temp;
//		System.out.println("After 1.way swapping: " + n1 + " - " + n2);
		
		//2.Way: Do not use 3rd variable
		n1 = n1 + n2;

		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After 2.way swapping: " + n1 + " - " + n2);

		//Exampl
		int n5=10;
		int n6=20;
		System.out.println("Before ** swapping: " + n5 + " - " + n6);
		n5=n5+n6;//30
		n6=n5-n6;//10
		n5=n5-n6;//20
		System.out.println("after ** swapping: " + n5 + " - " + n6);



	}

}
