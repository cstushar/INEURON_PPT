
public class Dsa_Q2 {

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3};
		int val = 3;
		int result = removeElement(nums, val);
		System.out.println("Output: " + result);
		System.out.print("nums: [");
		for (int i = 0; i < result; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(nums[i]);
		}
		System.out.println("]");
	}
}
