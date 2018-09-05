package PracticeQuestions;

public class FindEvenChar {
	
	public void findEvenChar(String str)
	{
		for(int i=0;i<str.length()-1;i++)
		{
			if(i%2==0)
			{
				if(str.charAt(i)!=' ')
				{
					System.out.println("evne char is"+str.charAt(i));
				}
					
			}
				
				
					
		}
	}
	

	public static void main(String[] args) {


    FindEvenChar FEC= new FindEvenChar();
    FEC.findEvenChar("Puneet Kumar Mangal");
	}

}
