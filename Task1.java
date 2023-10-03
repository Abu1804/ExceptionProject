package exception;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("hi");
		String a = null;
		// System.out.println(a);
		try {
			System.out.println(a.toUpperCase());
		} catch (Exception v) {

			System.out.println("It is emptyString");
		}
	}
}
