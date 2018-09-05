package PracticeQuestions;

import java.util.HashMap;
import java.util.Iterator;

public class findNumbers {

	
		public void findNumber(String str)
		{
			
			int total=0;
			int sum=0;
		
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				
			   if(c>=48&&c<=57)
				{
				   int a=Integer.parseInt(String.valueOf(c));
				   sum=sum*10+a;
				   
				}
			   else
			   {
				   total=total+sum;
				   sum=0;
			   }
			  
			   
		}
			total=total+sum;
			System.out.println(total);
		}

		public static void main(String[] args) {
		
			
			String str="ABC13DDE31FFG40ND10";
			findNumbers u=new findNumbers();
			u.findNumber(str);

		}


	

}
