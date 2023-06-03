
public class Dsa_Q7 {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };

		int left = 0;
		int right = 0;

		while (right < nums.length) {
			if (nums[right] != 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
			}
			right++;
		}

		for (int elem : nums) {
			System.out.print(" " + elem);
		}

	}

}
