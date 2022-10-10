package ngaoile;

import java.util.InputMismatchException;

public class NgoaiLe {
	public static int divide (String s1, String s2) {
		int c = -1;
		try {
			int a = Integer.parseInt(s1); //parse sai thì ném ra InputMismatchException
			int b = Integer.parseInt(s2);
			c = a/b;  // nếu chia cho 0q thì ném ra ArithmeticException
		} catch (InputMismatchException ex) {
			System.out
					.println("InputMismatch");
		} finally {
			System.out
					.println("Finally");
		}
		return c;
	}
	public static void main(
			String[] args) {
		try {
			System.out
					.println(divide("12","0"));
		} catch (ArithmeticException ex) {
			System.out
					.println("DivideByZero");
		}
		System.out
				.println("Done");
	}

}
