package exception;

public class VoterAge {
	public static void main(String[] args) throws AgeException {
		String name = "Raj";
		int age = 17;
		String gender = "male";
		if (age > 17) {
			System.out.println("you can apply voterId");
		} else {
			throw new AgeException("not a valid age ");
		}
		System.out.println(name + "-" + gender);
	}
}
