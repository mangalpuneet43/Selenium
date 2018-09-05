package Collections;

import java.util.ArrayList;

import org.apache.xpath.operations.String;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class ArrayListCollection  {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add("Puneet");
		ar.add(10);
		ar.add(10.5);
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<Float> ar2=new ArrayList<Float>();
		ar2.add(10.5f);
		ar2.add(11.5f);
		ar2.add(12.5f);
		
		for(float s: ar2)
		{
			System.out.println(s);
		}
		
ArrayList<Integer> ar3=new ArrayList<Integer>();
ar3.add(10);
ar3.add(20);
ar3.add(30);


Iterator<Integer> it=ar3.iterator();

while(it.hasNext())
{
	int a=it.next();
	
	System.out.println(a);
}

    Students s1=new Students("Puneet",29,45.6);
    Students s2=new Students("Kamal",28,47.6);
    Students s3=new Students("Raj",27,48.6);
    Students s4=new Students("Kittu",28,47.6);
    Students s5=new Students("Raj",27,48.6);
    
    
    ArrayList<Students> ar4=new ArrayList<Students>();
    ar4.add(s1);
    ar4.add(s2);
    ar4.add(s3);
    
    ArrayList<Students> ar5=new ArrayList<Students>();
    ar5.add(s4);
    ar5.add(s5);
  
   ar4.addAll(ar5);
//    
//    for(int i=0;i<ar4.size();i++)
//    {
//    	System.out.println(ar4.get(i).EmpName);
//    	System.out.println(ar4.get(i).EmpAge);
//    	System.out.println(ar4.get(i).Empsal);
//    }
//    
//    ar4.removeAll(ar5);
//    for(int i=0;i<ar4.size();i++)
//    {
//    	System.out.println(ar4.get(i).EmpName);
//    	System.out.println(ar4.get(i).EmpAge);
//    	System.out.println(ar4.get(i).Empsal);
//    }
    ar4.retainAll(ar5);
    for(int i=0;i<ar4.size();i++)
    {
    	System.out.println(ar4.get(i).EmpName);
    	System.out.println(ar4.get(i).EmpAge);
    	System.out.println(ar4.get(i).Empsal);
    }
	}

}
