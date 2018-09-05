package PracticeQuestions;

public class PrimeCheck {
	
	public void IsPrime(int a)
	{
		boolean flag=false;
		for(int i=2;i<=a/2;i++)
				{
			if(a%i==0)
			{
				flag=true;
				break;
			}
				}
		if(flag==true)
			System.out.println("Number is not a prime number");
		else
		{
			System.out.println("Number is  a prime number");
		}
	}

	public static void main(String[] args) {
PrimeCheck p = new PrimeCheck();
p.IsPrime(21);

	}

}
