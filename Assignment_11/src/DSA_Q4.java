public class DSA_Q4 {
	    public static int findRepeatedNumber(int[] nums) {
	        // Phase 1: Detect the intersection point of the cycle
	        int slow = nums[0];
	        int fast = nums[0];
	        
	        do {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        } while (slow != fast);
	        
	        // Phase 2: Find the entrance of the cycle
	        int pointer1 = nums[0];
	        int pointer2 = slow;
	        
	        while (pointer1 != pointer2) {
	            pointer1 = nums[pointer1];
	            pointer2 = nums[pointer2];
	        }
	        
	        return pointer1;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 3, 4, 2, 2};
	        int repeatedNumber = findRepeatedNumber(nums);
	        System.out.println("Repeated number: " + repeatedNumber);
	    }
	}
