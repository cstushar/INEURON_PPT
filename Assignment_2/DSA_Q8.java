
public class DSA_Q8 {

	public static void main(String[] args) {
	
		int[] nums = { 1 };
		int k = 0;

		int minNum = Integer.MAX_VALUE;
		int maxNum = Integer.MIN_VALUE;

		for (int num : nums) {
			minNum = Math.min(minNum, num);
			maxNum = Math.max(maxNum, num);
		}

		if (minNum + k >= maxNum - k) {
			System.out.println(maxNum - minNum - 2 * k); 
		} else {
			System.out.println(0);
		}
	}

}
