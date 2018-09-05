package PracticeQuestions;

import java.util.ArrayList;

public class StringSortedCheck {
	

    
     
     
     public boolean IsSorted(ArrayList<String> a)
	{
    	 boolean sorted=true;
		for(int i=1;i<a.size();i++)
		{
			if(a.get(i-1).compareTo(a.get(i))>0)
			{
				sorted=false;
			
			}
		}
    	return sorted; 
    	 
	}
	
	
	
	

	public static void main(String[] args) {
		 ArrayList<String> s=new ArrayList<String>();
		 
		
		 s.add("Kumar");
		 s.add("Mangal");
		 s.add("Puneet");
		 s.add("Bumar");
		 StringSortedCheck h=new StringSortedCheck();
		System.out.println(h.IsSorted(s))
		;
	}

}
