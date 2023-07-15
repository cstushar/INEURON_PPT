public class DSA_Q8 {
	public static boolean buddyStrings(String s, String goal) {
		if (s.length() != goal.length() || s.length() < 2) {
			return false;
		}

		if (s.equals(goal)) {
			int[] freq = new int[26];
			for (char c : s.toCharArray()) {
				freq[c - 'a']++;
				if (freq[c - 'a'] > 1) {
					return true;
				}
			}
			return false;
		}

		int firstMismatch = -1;
		int secondMismatch = -1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != goal.charAt(i)) {
				if (firstMismatch == -1) {
					firstMismatch = i;
				} else if (secondMismatch == -1) {
					secondMismatch = i;
				} else {
					return false;
				}
			}
		}

		return (secondMismatch != -1 && s.charAt(firstMismatch) == goal.charAt(secondMismatch)
				&& s.charAt(secondMismatch) == goal.charAt(firstMismatch));
	}

	public static void main(String[] args) {
		String s = "ab";
		String goal = "ba";
		boolean canSwap = buddyStrings(s, goal);
		System.out.println("Can swap: " + canSwap);
	}
}
