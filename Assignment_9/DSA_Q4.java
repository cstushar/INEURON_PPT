
public class DSA_Q4 {

	public static void main(String[] args) {

		int N = 2;
		int P = 5;

		int result = PowerOf(N, P);
		System.out.println(result);

	}

	private static int PowerOf(int n, int p) {

		if (p == 1) {
			return n * p;
		}

		return n * PowerOf(n, p - 1);
	}

}
