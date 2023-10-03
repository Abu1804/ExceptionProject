package exception;

import java.util.Scanner;

public class ScanStr {
	public static void main(String[] args) throws AgeException {
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter name");
		String name = ab.next();
		System.out.print("Enter age");
		int age = ab.nextInt();
		if (age > 17) {
			System.out.println("welcome to our portal");
		} else {
			throw new AgeException("you can't");
			// System.out.println("your not eligible");
		}
		System.out.println("Enter your gender");
		// Scanner abc=new Scanner(System.in);
		String gender = ab.next();
		System.out.println(gender);
	}
}
