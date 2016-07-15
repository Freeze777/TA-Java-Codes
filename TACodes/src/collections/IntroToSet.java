package collections;

import java.util.HashSet;
import java.util.Set;

public class IntroToSet {
	/* A collection that contains no duplicate elements */
	/*
	 * No additional methods, same as in Collection Interface
	 * src: http://stackoverflow.com/questions/3978570/java-set-interface-and-collection-interface-differences
	 * 
	 * Can do all the mathematical set operations..!
	 * Handy Implementation : HashSet,TreeSet,LinkedHashSet (iterator order is different)
	 */
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();
		//Set<Integer> set=new TreeSet<Integer>();
		//Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(108);
		set.add(156);
		set.add(10);
		set.add(-10);
		set.add(1048);
		System.out.println(set);// why different o/ps??does the iterator get called in the toString???
		System.out.println(set.contains(10));
		
		Set<Integer> newSet=new HashSet<Integer>();
		newSet.add(1080);
		newSet.add(156);
		set.addAll(newSet);// union !!!
		//set.retainAll(newSet);// intersection !!!
		System.out.println(set);		
		
		/**
		 * When to use HS,TS,LHS???
		 * Whats soo different b/n HS and LHS??
		 * Complexities with each implementations?? Internal Data Structures??
		 * */
		// remember panagrams???? 
		// https://leetcode.com/problems/happy-number/ 
		

	}

}
