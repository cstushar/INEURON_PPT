
public class DSA_Q2 {

	public static void main(String[] args) {
		// Given a number n, find the sum of the first natural numbers.

		int n = 5;

		int result = SumOfNo(n);
		System.out.println(result);

	}

	private static int SumOfNo(int n) {

		if (n == 1) {
			return 1;
		}
		return SumOfNo(n-1) + n;
	}

}
