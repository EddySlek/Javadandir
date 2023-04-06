package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion01__ {
	
	//Write a Java Program to reverse a string  "denver -> revned"

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String str = scan.nextLine();
		scan.close();


		String str4 = "DENVER";
		StringBuilder strY = new StringBuilder();
		strY.append(str4);
		System.out.println(strY.reverse());


		//1.Way: By using StringBuilder()
		StringBuilder strB = new StringBuilder();
		strB.append(str);
		System.out.println(strB.reverse());
		
		String revStr = "";
		//2.Way: By using String Class
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
		
		//3.Way: Create a method then call the method from main method
		System.out.println(revStr(str));

		//4.way: just call method
		revStr2(str);
	}
	
	public static String revStr(String str) {
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;
	}

	public static void revStr2(String str) {
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
		System.out.println("2.way");
	}

	/*
			OOP Concepts: "E-API"
			1-Encapsulation
			4-Abstraction
			2-Polymorphism
			3-Inheritance
		 */

}
