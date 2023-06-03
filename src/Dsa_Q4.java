import java.util.Arrays;

public class Dsa_Q4 {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		int[] result = plusOne(digits);
		System.out.println("Output: " + Arrays.toString(result));
	}
	
	static public int[] plusOne(int[] digits) {
		int n = digits.length;
		int carry = 1;

		for (int i = n - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			digits[i] = sum % 10;
			carry = sum / 10;
		}

		if (carry == 1) {
			int[] result = new int[n + 1];
			result[0] = 1;
			System.arraycopy(digits, 0, result, 1, n);
			return result;
		} else {
			return digits;
		}
	}

}
