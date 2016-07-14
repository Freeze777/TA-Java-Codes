package snippets.day2;

public class GenericSort 
{
	public static <T extends Comparable<T>> void sort(T arr[])
	{
		int l = arr.length - 1;
		
		for(int i = 1; i<=l; i++){
			int j = i-1;
			T temp = arr[i];
			while(j >=0  && arr[j].compareTo(temp) > 0){
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1]	= temp;
		}
	}
	
	public static void main(String args[])
	{
		Integer arr[] = {5,4,3,2,1};
		sort(arr);
		
		for(int i:arr)
			System.out.println(i);
		String arr1[] = {"Palash","Freeze","Mani","Prachi"};
		sort(arr1);
		for(String s:arr1)
			System.out.println(s);
	}
}
