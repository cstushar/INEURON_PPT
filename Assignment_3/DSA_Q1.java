import java.util.Arrays;

public class DSA_Q1 {

	public static void main(String[] args) {

		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		int n = nums.length;
		int closestSum = nums[n-1];

		Arrays.sort(nums);

		for (int i = 0; i < n - 2; i++) {
			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				int currentSum = nums[i] + nums[left] + nums[right];

				if (currentSum == target) {
					System.out.println(target);
				}

				if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
					closestSum = currentSum;
				}

				if (currentSum < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		System.out.println(closestSum);
	}
}
