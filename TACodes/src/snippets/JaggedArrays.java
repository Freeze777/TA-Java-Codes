package snippets;

public class JaggedArrays {
	public static void main(String[] args) {
		int[][] arr=new int[10][];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new int[i+1];
		}
		//https://leetcode.com/problems/pascals-triangle/
		//Pascal Triangel-- possible without extra space too..!
	}
}
