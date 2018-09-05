package PracticeQuestions;

public class Prime1toN {
	
	public void prime()
	{
		String primeNumber="";
		for(int i=1;i<=200;i++)
		{
			int counter=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num==0)
					counter++;
			}
			if(counter==2)
			primeNumber=primeNumber+i+" ";	
		}
		System.out.println("PrimeNumber is"+primeNumber);
	}

	public static void main(String[] args) {


Prime1toN prm= new Prime1toN();
prm.prime();
	}

}
