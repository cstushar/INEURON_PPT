
public class DSA_Q6 {

	public static void main(String[] args) {

		String s = "abcde";
		String goal = "cdeab";

		String concat = s + s;

		if (concat.contains(goal)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
