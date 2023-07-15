public class DSA_Q7 {
    public static void printPermutations(String str) {
        permute(str, "");
    }

    private static void permute(String str, String currentPermutation) {
        if (str.isEmpty()) {
            System.out.println(currentPermutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            permute(remainingChars, currentPermutation + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abb";
        printPermutations(str);
    }
}
