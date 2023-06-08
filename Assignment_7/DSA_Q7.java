
public class DSA_Q7 {

	public static void main(String[] args) {

		String s = "ab#c";
		String t = "ad#c";

		StringBuilder s1 = null ;
		StringBuilder t1 = null ;

		int p1 = s.length() - 1;
		int p2 = t.length() - 1;

		while (p1 <= 0 || p2 <= 0) {

			if (p1 != 0) {
				if (s.charAt(p1) == '#') {
					p1 = p1 - 2;
				} else {
					s1 = s1.append(s.charAt(p1));
					p1--;
				}
			}

			if (p2 != 0)
				if (t.charAt(p2) == '#') {
					p2 = p2 - 2;
				} else {
					t1 = t1.append(t.charAt(p2));
					p2--;
				}
		}

		if (s1 != t1) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}

	}
}
