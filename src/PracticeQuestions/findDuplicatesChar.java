package PracticeQuestions;

import java.util.HashMap;
import java.util.Iterator;

public class findDuplicatesChar {

	public void findduplicates(String arr)
	{
		
		HashMap<Character,Integer> ht= new HashMap<Character,Integer>();
	
		{
			for(int i=0;i<arr.length();i++)
			{
				char c=arr.charAt(i);
				if(ht.get(c)!=null)
				{
					ht.put(c, ht.get(c)+1);
				}
				else
				{
					ht.put(c, 1);
				}
			}
			
		}
		
		
		Iterator<Character> keyset=ht.keySet().iterator();
		while(keyset.hasNext())
		{
			char keys=keyset.next();
			if(ht.get(keys)>1)
			{
				System.out.println(keys+" is appeared "+ht.get(keys)+" times");
			}
		}
	}
	
	
	



	public static void main(String[] args) {
		String str="JavageeksJavaPuneetJavatpoint";
	    findDuplicatesChar fnd=new findDuplicatesChar();
	    fnd.findduplicates(str);
		

	}
	

	

}
