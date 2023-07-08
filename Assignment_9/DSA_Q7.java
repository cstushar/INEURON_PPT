public class DSA_Q7 {
    public static void main(String[] args) {
        String S = "ABC";
        printPermutations(S);
    }

    public static void printPermutations(String s) {
        permute(s, 0, s.length() - 1);
    }

    public static void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swap(s, l, i); // backtrack to restore the original string
            }
        }
    }

    public static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

