package collections;

import java.util.*;

/* Queue extends collection interface , i.e it has all the declaration of collection too
 * 
 Handy function declarations in Queue Interface: 
 boolean add(E e);
 E element();
 E peek();
 E poll();
 E remove(); 
 * */
public class IntroToQueue {
	/*
	 * Handy Implementation : LinkedList(FIFO),PriorityQueue(Priority
	 * Based),ArrayDeque(?)
	 */
	// Are Queue implementations FIFO?????? beware..!!!!
	/*
	 * From Javadocs: Queues typically, but do not necessarily, order elements
	 * in a FIFO (first-in-first-out) manner.Exceptions priority queues,LIFO
	 * queues (or stacks).
	 * 
	 * Differnce of poll() and remove()??? find out..!
	 */
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(1000);
		queue.add(598);
		queue.add(20);
		queue.add(190);
		queue.add(1190);
		queue.add(90);
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue);
		/* When to use PQ and LL?? 
		 * Time complexities associated with each implementation??
		 * 
		 * eg applications: Level order traversal, Dijkstra , BFS.
		 * */
		//http://codeforces.com/problemset/problem/535/B -can be done using other ways too!!
		//https://www.hackerrank.com/challenges/find-the-running-median
	}
}
