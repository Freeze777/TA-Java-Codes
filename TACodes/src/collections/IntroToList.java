package collections;

import java.util.LinkedList;
import java.util.List;

//List Interface--- how it looks like??
/* 
 * A few handy methods declaration to remember:
 * void add(int index, Object obj);
 * Object get(int index); 
 * int indexOf(Object obj);
 * ListIterator listIterator( );
 * Object remove(int index);
 * int size();
 *  
 */
public class IntroToList {
	/*
	 * LinkedList,ArrayList,Vector ---- implementations of the List. 
	 * ArrayList implements it with a dynamically re-sizing array
	 * LinkedList uses doubly-linked list.
	 */
	public static void main(String[] args) {

		// why do we need a List<>????

		// List<Integer> al = new ArrayList<Integer>();
		List<Integer> al = new LinkedList<Integer>();
		//Can we access all the functions defined in ArrayList using List handle?? 
		// Does the output change when we change the implementation??
		al.add(8);
		al.add(9);
		al.add(1);
		al.add(20);
		al.add(210);
		al.add(-20);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		System.out.println("4th element in the list: " + al.get(3));
		System.out.println("Index of -20: " + al.indexOf(-20));
		
		// time complexities associated with AL and LL impl????
		// get()???add()??add(index,obj)??remove(index)??
		// LinkedList can proceed from end on back depending on which is closer
		// Random access with arraylist..!
		// when to use LL over a AL???
		// How does array list expand?? 50% i.e 1.5x ?? check grow() function in ArrayList class..!!
		
		/*
		 * One more implementation : Vector No one uses it?? why??
		 */

	}

}
