
public class DSA_Q4 {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };
		int target = 5;

		int place =0;
		
		for (int i = 0; i < nums.length; i++) {			
			
		
			if(nums[i] > target) {
				break;
			}else {
				place = i;
			}
		}
		
		System.out.println(place);
	}

}
