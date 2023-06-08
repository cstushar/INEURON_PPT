import java.util.HashSet;
import java.util.Set;

public class DSA_Q2 {

	public static boolean isStrobogrammatic(String num) {
		int left = 0;
		int right = num.length() - 1;

		Set<String> validPairs = new HashSet<>();
		validPairs.add("00");
		validPairs.add("11");
		validPairs.add("88");
		validPairs.add("69");
		validPairs.add("96");

		while (left <= right) {
			String pair = num.charAt(left) + "" + num.charAt(right);
			if (!validPairs.contains(pair)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		String num = "69";
		System.out.println(isStrobogrammatic(num)); // Output: true
	}

}
