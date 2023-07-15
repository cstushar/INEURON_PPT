public class DSA_Q8 {
	    public static int countConsonants(String str) {
	        int consonantCount = 0;
	        str = str.toLowerCase();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (isConsonant(ch)) {
	                consonantCount++;
	            }
	        }

	        return consonantCount;
	    }

	    private static boolean isConsonant(char ch) {
	        return ch >= 'a' && ch <= 'z' && !"aeiou".contains(String.valueOf(ch));
	    }

	    public static void main(String[] args) {
	        String str = "geeksforgeeks portal";
	        int count = countConsonants(str);
	        System.out.println("Count of consonants: " + count);
	    }
	}

