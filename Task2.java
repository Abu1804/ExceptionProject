package exception;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("hi");
		String ab = "TN46";
		try {
			int num = Integer.parseInt(ab);
			System.out.println(num);
		} catch (Exception n) {
			System.out.println("Not a proper value");
		}
	}
}
