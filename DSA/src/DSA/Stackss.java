package DSA;
import java.util.*;
public class Stackss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create The Stack
		Stack<String> stack1 = new Stack<>();
		
		//Adding Elements in Stack
		stack1.push("Apple"); //Time Complexity 0(1) 
		stack1.push("Banana");
		stack1.push("Orange");
		stack1.push("Grapes");
		
		System.out.println(stack1);
		
		//Removing the Elements Always the Last Element which is Addeed is Reomoved
		System.out.println();
		
		String popedElement=stack1.pop();//Time Complexity 0(1)
		
		System.out.println("Reomving the Elements Always the Last Element which is Addeed is Reomoved");
		
		System.out.println(stack1);
		
		System.out.println("Poped Element : "+popedElement);
		
		//Getting the Peek element which is on the top of the Stack
		
		System.out.println();
		
		String topElement=stack1.peek();//Time Complexity 0(1)
		
		System.out.println("Getting the Peek element which is on the top of the Stack");
		
		System.out.println(stack1);
		
		System.out.println("Top Element : "+topElement);
		
		//Searching for the Particular Elements
		System.out.println();
		
		int searchElement=stack1.search("Apple");//Time Complexity 0(n)
		
		System.out.println("Searching fot the Particular Element Apple");
		
		if (searchElement!= -1)
	        System.out.println("Element is present");
		else
			System.out.println("Element is not present");
		
		System.out.println();
		
		System.out.println("Size of the Stack : "+stack1.size());//Size of the Stack
		
		System.out.println();
		
		System.out.println("Check the Stack is Empty or Not : "+stack1.isEmpty());//Checks the Stack is Empty  //Time Complexity 0(1)



		
		
		
		
		
		
	}

}
