package DSA;
import java.util.*;

public class ArrayLists {
	public static void main(String[] args) {
		
		//Instead of Array you can Resize the Array's That is what the ArryList
		ArrayList<Integer> arrayList1 = new ArrayList<>();//Here WE Declared a Array List But We didn't Declare any Size of the Array
		//But We Can Add N Number of elements in it 
		ArrayList<Integer> arrayList2 = new ArrayList<>();//Here WE Declared a Array List But We didn't Declare any Size of the Array

		for (int i=0;i<=10;i++) {
			arrayList1.add(i);
		}
//		for printing the elements in the List
		System.out.println("Values in arrayList1 are");

		for(int values:arrayList1) {
			System.out.println(values);
		}
		
//		adding the Values
		System.out.println("adding the Values");
		arrayList1.add(19);
		for(int values:arrayList1) {
			System.out.println(values);
		}
		System.out.println("added in the Bottom Like Queue");
		
		
//		adding the Values After some Position
		System.out.println("adding the Values After some Position");
		arrayList1.add(5,51);
		for(int values:arrayList1) {
			System.out.println(values);
		}
		System.out.println("added After the 5th Position");
		
//	remove elements in Array List
		
		System.out.println("Removing the 51");
		arrayList1.remove(5);
		for(int values:arrayList1) {
			System.out.println(values);
		}
		System.out.println("Removed the 51");
		
		System.out.println(arrayList1.contains(9));//Check Whether the Position Has Value or Not return Bool
		System.out.println(arrayList1.equals(arrayList1));//Compare the ArrayLists
		System.out.println(arrayList1.equals(arrayList2));
		System.out.println(arrayList1.size());//Return the Size
		System.out.println(arrayList1.get(11));//Fetch the Value in that Position
		System.out.println(arrayList2.isEmpty());//Check that is Empty or not
//		System.out.println(arrayList1.toString());//Changes in to String
		arrayList2.addAll(arrayList1);
		for(int value:arrayList2) {
			System.out.println(value);
		}

		
	}

}
