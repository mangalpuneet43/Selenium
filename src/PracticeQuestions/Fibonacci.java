package PracticeQuestions;

public class Fibonacci {

	int a = 0;
	int b = 1;
	int c;

	public void fib() {
		System.out.print(a);
		for (int i = 1; i <= 5; i++) {
			c = a + b;
			a = b;
			b = i;

			System.out.print(c);
		}

	}

	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();
		f.fib();
	}

}
