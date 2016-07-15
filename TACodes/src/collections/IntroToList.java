package collections;

import java.util.LinkedList;
import java.util.List;
//List interface extends collection interface.. i.e it has all the declaration of collection too
//List Interface--- how it looks like??
/* 
 * A few handy methods declaration to remember:
 * void add(int index, Object obj);
 * Object get(int index); 
 * int indexOf(Object obj);
 * Object remove(int index);
 *  
 */
public class IntroToList {
	/*
	 * LinkedList,ArrayList,Vector ---- implementations of the List. 
	 * ArrayList implements it with a dynamically re-sizing array
	 * LinkedList uses doubly-linked list.
	 */
	public static void main(String[] args) {

		// why/when do we need a List<>????

		// List<Integer> al = new ArrayList<Integer>();
		List<Integer> al = new LinkedList<Integer>();
		//Can we access all the functions defined in ArrayList using List handle?? 
		// Does the following output change when we change the implementation??
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
		// get(index)??--- O(1) AL ?? LL??
		// add()??---- O(1) LL?? AL??? table doubling??
		// How does array list expand?? 50% i.e 1.5x ?? check grow() function in ArrayList class..!!
		// add(index,obj)??remove(index)?? ---- shifts in AL, find index in LL
		// LinkedList can proceed from begin or end
		// Random access with arraylist..!
		// when to use LL over a AL???
		
		
		/*
		 * One more implementation : Vector No one uses it?? why??
		 */

	}

}
