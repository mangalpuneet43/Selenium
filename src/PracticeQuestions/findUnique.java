package PracticeQuestions;

import java.util.HashMap;
import java.util.Iterator;

public class findUnique {
	
	public void findUniques(String str)
	{
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
				
			}
			else
				hm.put(c,1);
		}
		Iterator<Character>Keysets = hm.keySet().iterator();
		
		while(Keysets.hasNext())
		{
			char d=Keysets.next();
			if(hm.get(d)<=1)
				System.out.println(d+" "+hm.get(d));
				
		}
	}

	public static void main(String[] args) {
	
		
		String str="aabbccdde";
		findUnique u=new findUnique();
		u.findUniques(str);

	}

}
