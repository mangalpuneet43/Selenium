package PracticeQuestions;

public class Pallindrome {
	
	public void pallindrome(String arr)
	{
		int i=0;
	
			for(int j=arr.length()-1;j>=0;j--)
			{
				if(arr.charAt(i)==arr.charAt(j))
				{
					i++;
				}
				else
				{
					System.out.println("String is not pallindrome");
					break;
				}
				
				if(i>j)
				{
					System.out.println("String is  pallindrome");
					break;
					
				}
					
					
			
			
		}
	}

	public static void main(String[] args) {
		String arr="1213";
		Pallindrome p= new Pallindrome();
		p.pallindrome(arr);
		
		
	}

}
