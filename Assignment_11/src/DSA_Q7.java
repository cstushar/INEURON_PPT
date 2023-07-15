public class DSA_Q7 {
	    public static int[] searchRange(int[] nums, int target) {
	        int[] result = {-1, -1};
	        
	        // Find the leftmost position of the target
	        int leftIndex = binarySearch(nums, target, true);
	        
	        // If the target is not found, return [-1, -1]
	        if (leftIndex == nums.length || nums[leftIndex] != target) {
	            return result;
	        }
	        
	        // Find the rightmost position of the target
	        int rightIndex = binarySearch(nums, target, false) - 1;
	        
	        result[0] = leftIndex;
	        result[1] = rightIndex;
	        
	        return result;
	    }
	    
	    private static int binarySearch(int[] nums, int target, boolean left) {
	        int low = 0;
	        int high = nums.length;
	        
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            
	            if (nums[mid] > target || (left && nums[mid] == target)) {
	                high = mid;
	            } else {
	                low = mid + 1;
	            }
	        }
	        
	        return low;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {5, 7, 7, 8, 8, 10};
	        int target = 8;
	        int[] range = searchRange(nums, target);
	        
	        System.out.println("Starting position: " + range[0]);
	        System.out.println("Ending position: " + range[1]);
	    }
	}
