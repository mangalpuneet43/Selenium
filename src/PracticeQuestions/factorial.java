package PracticeQuestions;

public class factorial {
	public int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		
		factorial f = new factorial();
	int a=f.fibonacci(5);
	
	System.out.println(a);
		

	}

}
