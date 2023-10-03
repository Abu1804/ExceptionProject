package exception;

public class Task {
	public static void main(String[] args) {
		System.out.println("hi");
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			// System.out.println("don't divindeby 0");
			// System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("byee");
	}
}
