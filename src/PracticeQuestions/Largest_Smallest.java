package PracticeQuestions;

import java.util.Arrays;

public class Largest_Smallest {
	
	public void number(int arr[])
	{
		int small=arr[0];
		int large=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
			else if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		
		System.out.println(small+"    "+large);
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
	
		
		int numbers[]= {10,5,20,-20,85,-40,1000};
		Largest_Smallest n = new Largest_Smallest();
		n.number(numbers);

	}

}
