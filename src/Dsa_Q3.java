
public class Dsa_Q3 {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		int value = findValue(nums, target);
		
		if(value != 0) {
			System.out.println("Index of the target value is : "+value);
		}else{
			System.out.println("Invalid Input");
		}
	}

	private static int findValue(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == target) {
				return i;
			}
			if (nums[i] > target) {
				return i;
			}

		}
		return 0;
	}

}
