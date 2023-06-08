
public class DSA_Q5 {

	public static void main(String[] args) {

		String s = "abcdefg";
		char[] chars = s.toCharArray();
		int k = 2;

		for (int i = 0; i < chars.length; i += 2 * k) {
			int start = i;
			int end = Math.min(i + k - 1, chars.length - 1);

			while (start < end) {
				char temp = chars[start];
				chars[start] = chars[end];
				chars[end] = temp;
				start++;
				end--;
			}
		}

		System.out.println(chars);

	}

}
