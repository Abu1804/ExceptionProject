package exception;

public class STryMCatch {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (NullPointerException a) {
			System.out.println("It is a nullvalue");
		} catch (NumberFormatException b) {
			System.out.println("kjsbhg");
		} catch (Exception c) {
			System.out.println("Don't try");
		}
	}
}
