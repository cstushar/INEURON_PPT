import java.util.HashMap;
import java.util.Map;

public class DSA_Q1 {

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> sToT = new HashMap<>();
		Map<Character, Character> tToS = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char cS = s.charAt(i);
			char cT = t.charAt(i);

			if (sToT.containsKey(cS) && tToS.containsKey(cT)) {
				if (sToT.get(cS) != cT || tToS.get(cT) != cS) {
					return false;
				}
			} else if (!sToT.containsKey(cS) && !tToS.containsKey(cT)) {
				sToT.put(cS, cT);
				tToS.put(cT, cS);
			} else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		System.out.println(isIsomorphic(s, t)); // Output: true
	}

}
