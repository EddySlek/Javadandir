package javacourses.tecH.day17arrays;

import java.util.Arrays;

public class _PracticeArrays {

	public static void main(String[] args) {
		
		//Write a Java program to sort a numeric array and a string array.
		int[] nbr = {10,5,43,23,12,90,78};
		String[] alph = {"selfstudy", "colorado", "denver"};
		
		System.out.println(Arrays.toString(nbr));
		System.out.println(Arrays.toString(alph));
		
		Arrays.sort(nbr);
		Arrays.sort(alph);
		System.out.println(Arrays.toString(nbr));
		System.out.println(Arrays.toString(alph));
		
		
		//Write a Java program to sum values of an array.
		String[] ar1 = new String[3];
		ar1[0]="coding";
		ar1[1]="java";
		ar1[2]="dude";
		int sum=0;
		System.out.println(ar1.length);
		
		for(String i : ar1) {
			
		}
			System.out.println(sum);
		
		
		
		
		
	}
}
