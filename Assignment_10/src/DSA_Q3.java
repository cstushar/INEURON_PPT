public class DSA_Q3 {
    public static void printSubsets(String set) {
        printSubsetsHelper(set, "", 0);
    }

    private static void printSubsetsHelper(String set, String currentSubset, int index) {
        if (index == set.length()) {
            System.out.print("\"" + currentSubset + "\", ");
            return;
        }

        // Recursive call without including the current character
        printSubsetsHelper(set, currentSubset, index + 1);

        // Recursive call including the current character
        printSubsetsHelper(set, currentSubset + set.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        String set = "abc";
        printSubsets(set);
    }
}
