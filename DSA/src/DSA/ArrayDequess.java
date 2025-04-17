package DSA;
import java.util.*;

public class ArrayDequess{
	public static void main(String[] args) {
		ArrayDeque<Integer> arrayDeque1=new ArrayDeque();
		arrayDeque1.add(8);
		arrayDeque1.addFirst(9);
		arrayDeque1.offerFirst(34);
		arrayDeque1.offerLast(78);
        System.out.println(arrayDeque1);
        System.out.println(arrayDeque1.peekFirst());
        System.out.println(arrayDeque1.getFirst());
        System.out.println(arrayDeque1.peekLast());
        System.out.println(arrayDeque1.getLast());
//System.out.println(arrayDeque1);
        arrayDeque1. pollFirst();
        arrayDeque1.removeFirst();
        System.out.println(arrayDeque1);
        arrayDeque1.pollLast();
        arrayDeque1.removeLast();
		System.out.println(arrayDeque1);	
	}

}
