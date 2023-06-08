
public class DSA_Q4 {

	public static String reverseWords(String s) {
		StringBuilder reversedSentence = new StringBuilder();
		StringBuilder currentWord = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != ' ') {
				currentWord.append(c);
			} else {
				reversedSentence.append(currentWord.reverse()).append(' ');
				currentWord.setLength(0); // Reset currentWord for the next word
			}
		}

		// Append the last word
		reversedSentence.append(currentWord.reverse());

		return reversedSentence.toString();
	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s)); 
	}

}
