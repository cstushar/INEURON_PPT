public class DSA_Q5 {
	public static int countContiguousSubstrings(String S) {
		int count = 0;

		for (int i = 0; i < S.length(); i++) {
			count++; // Increment count for single character substrings

			int start = i;
			int end = i;

			while (end < S.length() - 1 && S.charAt(end) == S.charAt(end + 1)) {
				end++;
				count++; // Increment count for substrings ending at 'end'
			}

			while (start > 0 && end < S.length() - 1 && S.charAt(start - 1) == S.charAt(end + 1)) {
				start--;
				end++;
				count++; // Increment count for substrings ending at 'end'
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String S = "abcab";
		int count = countContiguousSubstrings(S);
		System.out.println("Count of contiguous substrings: " + count);
	}
}
