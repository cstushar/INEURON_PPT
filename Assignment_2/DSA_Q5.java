
public class DSA_Q5 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };

		int max = 0;
		int sum;
		for (int i = 0; i < nums.length - 1; i++) {
			sum = nums[i] * nums[i + 1];

			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}

}
