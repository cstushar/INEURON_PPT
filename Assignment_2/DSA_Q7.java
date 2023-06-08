
public class DSA_Q7 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 3 };
		boolean flag = true;

		if (nums[0] < nums[1]) {
			// processing array
			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] > nums[j]) {
						flag = false;
						break;
					}
				}
			}
		} else {
			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] < nums[j]) {
						flag = false;
						break;
					}
				}
			}
		}

		System.out.println(flag);

	}

}
