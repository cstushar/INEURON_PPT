import java.util.ArrayList;
import java.util.List;

class DSA_Q7 {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> missingRanges = new ArrayList<>();

        // Handle lower and upper boundaries separately
        if (lower < nums[0]) {
            missingRanges.add(generateRange(lower, nums[0] - 1));
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                continue;
            } else {
                int minValue = nums[i] + 1;
                int maxValue = nums[i + 1] - 1;
                missingRanges.add(generateRange(minValue, maxValue));
            }
        }

        if (upper > nums[nums.length - 1]) {
            missingRanges.add(generateRange(nums[nums.length - 1] + 1, upper));
        }

        return missingRanges;
    }

    private static String generateRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
       
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        List<String> missingRanges = findMissingRanges(nums, lower, upper);

        System.out.println("Missing Ranges:");
        for (String range : missingRanges) {
            System.out.println(range);
        }
    }
}
