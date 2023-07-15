public class DSA_Q3 {
	    public static int findMissingNumber(int[] nums) {
	        int missingNumber = nums.length; // Initialize missingNumber with n
	        
	        for (int i = 0; i < nums.length; i++) {
	            missingNumber ^= i ^ nums[i];
	        }
	        
	        return missingNumber;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {3, 0, 1};
	        int missingNumber = findMissingNumber(nums);
	        System.out.println("Missing number: " + missingNumber);
	    }
	}

