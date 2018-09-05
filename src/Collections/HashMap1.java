package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
	
		//HashMap is implements from Map Interface
		//HashMap is stored the data based on the key value pair
		//No maintain of data orders
		//at least we can store one null key and multiple null value
		//Not Synchronized not thread safe.
		//ConcurrentModificationsException
	HashMap<Integer,String> hmap=new HashMap<Integer,String>();
	
	hmap.put(1, "Puneet");
	hmap.put(2, "Puneet2");
	hmap.put(3, "Puneet3");
	hmap.put(4, "Puneet4");
	
	
	System.out.println(hmap);
	System.out.println(hmap.get(4));
	
	
	for(Entry<Integer,String> e: hmap.entrySet())
	{
		
		System.out.println(e.getKey()+""+e.getValue());
	}
	
	HashMap<Integer,String> hmap1=new HashMap<Integer,String>();
	
	hmap1=(HashMap)hmap.clone();
	
	
	System.out.println(hmap1);



	}

}
