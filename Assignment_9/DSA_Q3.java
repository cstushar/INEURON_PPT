
public class DSA_Q3 {

	public static void main(String[] args) {

		int n = 5;

		int result = Factorial(n);
		System.out.println(result);

	}

	private static int Factorial(int n) {

		if (n == 1 || n == 0) {
			return 1;
		}
		
		return Factorial(n - 1) * n;
	}

}
