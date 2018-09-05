package PracticeQuestions;

public class ReverseString {

	String str = "";

	public void reverse(String arr) {
		int l = arr.length() - 1;
		for (int i = arr.length() - 1; i >= 0; i--) {
			str = str + arr.charAt(i);
		}

		System.out.println(str);
	}

	public static void main(String[] args) {

		ReverseString str = new ReverseString();
		str.reverse("Puneet Kumar Mangal");

	}

}
