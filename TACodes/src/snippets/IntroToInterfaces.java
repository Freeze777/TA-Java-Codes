package snippets;

import java.util.Arrays;
import java.util.Collections;

//variables static and final by default
interface Sort {
	String s = "sort interface";

	void sort(int[] arr);// why void return type??
}

class BubbleSort implements Sort {
	public void myOwnFunc() {
		System.out.println("This is not in the interface specs");
	}

	public void sort(int[] arr) {
		int len = arr.length;
		int temp;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

class SelectionSort implements Sort {
	public void myOwnFunc() {
		System.out.println("This is not in the interface specs");
	}

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}

	}
}

class QuickSort implements Sort {
	public void myOwnFunc() {
		System.out.println("This is not in the interface specs");
	}

	public void sort(int[] arr) {
		Arrays.sort(arr);// Arrays class has default sort function.!!
	}
}

// what sorting algorithms java uses??? for primitives?? for objects???

// user logic in different class
public class IntroToInterfaces {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// int[] arr=new int[5];
		int[] arr = { 8, 5, 9, 3, 7 };
		Sort sort = new QuickSort();
		sort.sort(arr);
		printArray(arr);

		/*
		 * User logic needs a sorted array
		 * tonnes of codes here ---user logic
		 * using arr businessLogic();
		 */
	}
}
