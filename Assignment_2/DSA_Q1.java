import java.util.Arrays;

public class DSA_Q1 {

	public static void main(String[] args) {
		
		int [] nums = {1,4,3,2};
		
		Arrays.sort(nums);
		int sum = 0;
		
		
		for(int i = 0; i< nums.length;i+=2) {
			
			sum += Math.min(nums[i], nums[i + 1]);
		}
		 
		System.out.println(sum);
	}

}
