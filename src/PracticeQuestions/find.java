package PracticeQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class find {
	
	public void finds(String str[])
	{
		Set<String> store = new HashSet<String>();
	
	     Map<String,Integer> s = new HashMap<String,Integer>();
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
					System.out.println("duplicate is"+str[i]);
			}
		}
		
		for(String a : str)
		{
		
		
		if(store.add(a)==false)
	     System.out.println("duplicate is"+a);
			
		}

		for(String a : str)
		{
		
		

     if(s.get(a)!=null)
      s.put(a, s.get(a)+1);
       else
	  s.put(a, 1);
		}
     
     Set<Entry<String,Integer>> entry = s.entrySet();
     
     for(Entry<String,Integer> b : entry)
     {
    	if(b.getValue()>1)
    	{
    		System.out.println(b.getKey());
    	}
     }
	  
			
		
	}

	public static void main(String[] args) {
		
		
		String arr[]= {"Java","Puneet","Java","Puneet","ASD"};
		find d = new find();
		d.finds(arr);

	}

}
