package PracticeQuestions;

import java.util.HashMap;
import java.util.Iterator;

public class findDuplicatesWord {


	public void findduplicates(String arr,String word)
	{
		String[] temp=arr.split(" ");
		HashMap<String,Integer> ht= new HashMap<String,Integer>();
		for(String a : temp)
		{
			if(ht.get(a)!=null&& a.equals(word))
			{
				ht.put(a,ht.get(a)+1);
			}
			else
				ht.put(a, 1);
		}
		
		
		Iterator<String> keyset=ht.keySet().iterator();
		while(keyset.hasNext())
		{
			String keys=keyset.next();
			if(ht.get(keys)>1)
			{
				System.out.println(keys+" is appeared "+ht.get(keys)+" times");
			}
		}
	}
	
	
	



	public static void main(String[] args) {
		String str="I am Indians I love Indians I am Indians";
		String word="Indians";
	    findDuplicatesWord fnd=new findDuplicatesWord();
	    fnd.findduplicates(str,word);
		

	}


	}


