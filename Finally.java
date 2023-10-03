package exception;

public class Finally {
	public static void main(String[] args) {
		System.out.println("hi");
		String ab = "prem";
		try {
			System.out.println(ab.charAt(5));
		} finally {
			System.out.println("check your program");
		}
	}
}
