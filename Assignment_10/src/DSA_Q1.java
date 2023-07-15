
public class DSA_Q1 {

	public static void main(String[] args) {
		int n = 27;
		
		System.out.println(isPowerOfThree(n));
	}

	public static boolean isPowerOfThree(int n) {
		if (n == 1) {
			return true;
		} else if (n % 3 != 0) {
			return false;
		} else {
			return isPowerOfThree(n / 3);
		}
	}
}
