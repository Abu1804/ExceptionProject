package exception;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		// System.out.println("Enter ist no:");
		int n1 = ab.nextInt();
		// System.out.println("Enter 2nd no:");
		int n2 = ab.nextInt();
		System.out.println("Additionof" + n1 + "&" + n2 + "=" + (n1 + n2));
	}
}
