package Collections;

public class StringBubbleSort {

	public static void main(String[] args) {


		String[] stringArray=new String[] {"Puneet","Kumar","Mangal","Apple"};
	     int n = stringArray.length;
	        String temp;
		 for (int i = 0; i < n; i++) {
	            for (int j = 1; j < (n - i); j++) {
	                if (stringArray[j - 1].compareTo( stringArray[j] ) > 0) {
	                    temp = stringArray[j - 1];
	                    stringArray[j - 1] = stringArray[j];
	                    stringArray[j] = temp;
	                }

	            }
		 }
		
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.println(stringArray[i]);
		}

	}

}
