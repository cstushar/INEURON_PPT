
public class DSA_Q6 {

	public static void main(String[] args) {

		int a = 5;
		int d = 2;
		int N = 10;

		int result = findNthTerm(a, d, N);
		System.out.println(result);
	}

	public static int findNthTerm(int a, int d, int N) {
		if (N == 1) {
			return a;
		} else {
			return findNthTerm(a + d, d, N - 1);
		}
	}
}
