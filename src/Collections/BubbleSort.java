package Collections;

public class BubbleSort {

	public static void main(String[] args) {


		int[]numArray=new int[] {10,5,85,4,25,1,8,7};
		int temp=0;
		
		int n = numArray.length;
	  

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (numArray[j - 1] > numArray[j]) {
	                temp = numArray[j - 1];
	                numArray[j - 1] = numArray[j];
	                numArray[j] = temp;
	            }

	        }
	    }	
			for(int j=0;j<n;j++)
			{
				System.out.println(numArray[j]);
			
		}
		
	
	}

	}

