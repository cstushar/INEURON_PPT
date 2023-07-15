
public class DSA_Q2 {

	public static int lastRemaining(int n) {
		if (n == 1) {
			return 1;
		} else {
			return 2 * (n / 2 + 1 - lastRemaining(n / 2));
		}
	}

	public static void main(String[] args) {
		int n = 9;
		int lastNumber = lastRemaining(n);
		System.out.println(lastNumber);
	}
}
