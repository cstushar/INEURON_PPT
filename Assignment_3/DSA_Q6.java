
import java.util.HashSet;

public class DSA_Q6 {
    public static int findSingleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        // The HashSet should contain only one element
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};

        int result = findSingleNumber(nums);

        System.out.println(result);
    }
}
