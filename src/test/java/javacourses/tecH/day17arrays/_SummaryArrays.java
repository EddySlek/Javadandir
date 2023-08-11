package javacourses.tecH.day17arrays;

import java.util.Arrays;

public class _SummaryArrays {

	public static void main(String[] args) {
		
		//1.Way to create Array
		int[] arr1 = new int[3];
		arr1[0] = 1;
		arr1[1] = 8;
		System.out.println(Arrays.toString(arr1));//1, 232, 0
		System.out.println(arr1[1]);//232
		System.out.println(arr1.length);//3
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//2.Way to create Array
		String[] arr2 = {"colorado", "denver", "bank"};
		int sum=0;
		for(int i=0; i<arr2.length; i++) {
			sum  =sum + arr2[i].length();
		}
		System.out.println("sum: " + sum );

		
	}
}
