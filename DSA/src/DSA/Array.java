package DSA;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Learning DSA in Array");
		
//		Declaration of Array
		
//		int[] marks; //Declaration!
//		marks = new int[5]; //Memory allocation!
//		int[] marks = new int[5]; //Declaration + Memory allocation!
//		int[] marks = {100,70,80,71,98};// Declare + Initialize!
		
//		Length of Array/
		int[] arry1 = new int[10];
		 
		for(int i=0;i<=9;i++) {
			arry1[i] = i+10;
			System.out.println("Index of arry1 is : "+i+" and its Value is : "+arry1[i]);
		}
		
		
		System.out.println("The lenght of the arry1 is : "+arry1.length);
		
//		Assigning Value in array
		
		arry1[7]=45;
		
		System.out.println("After Assigning the Value for the Index 7 the value is : "+arry1[7]);
		
//		using for each loops in arrays
		

		System.out.println("Using for Loops");
		for(int values:arry1) {
			System.out.println(values);
		}

	}

}
