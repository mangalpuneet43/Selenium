package PracticeQuestions;

import java.util.SortedMap;
import java.util.TreeSet;

public class ArraySort {
	
	public void sort(int arr[])
	{
		TreeSet<Integer> s=new TreeSet<Integer>();
		for(int a:arr)
		{
			s.add(a);
		}
		System.out.println(s);
		
	}

	public static void main(String[] args) {

		int arr[]= new int[] {10,5,2,25,30,0,1,90,45};

		ArraySort as=new ArraySort();
		as.sort(arr);
	}

}
