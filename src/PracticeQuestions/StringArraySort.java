package PracticeQuestions;

import java.util.TreeSet;

public class StringArraySort {

	public void sort(String arr[])
	{
		TreeSet<String> s=new TreeSet<String>();
		for(String a:arr)
		{
			s.add(a);
		}
		System.out.println(s);
		
	}

	public static void main(String[] args) {

	String arr[]= {"Puneet","Kumar","Mangal"};

		StringArraySort as=new StringArraySort();
		as.sort(arr);
	}
}
