
public class DSA_Q3 {

	public static void main(String[] args) {

		String num1 = "11";
		String num2 = "123";
		StringBuilder result = new StringBuilder();

		int p1 = num1.length() - 1;
		int p2 = num2.length() - 1;
		int carry = 0;

		while (p1 >= 0 || p2 >= 0 || carry != 0) {
			int digit1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
			int digit2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;

			// Calculate sum and carry
			int digitSum = digit1 + digit2 + carry;
			int digit = digitSum % 10;
			carry = digitSum / 10;

			// Add digit to the left side of the result
			result.insert(0, digit);

			// Move the pointers
			p1--;
			p2--;
		}

		System.out.println(result.toString());

	}

}
