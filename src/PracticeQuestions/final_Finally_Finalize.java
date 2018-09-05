package PracticeQuestions;
public class final_Finally_Finalize {
	
	public void m1()
	{
		System.out.println("Puneet");
	}
   
  
  

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {

		final_Finally_Finalize f1=new final_Finally_Finalize();
		f1.m1();
		System.gc();

	}

}
