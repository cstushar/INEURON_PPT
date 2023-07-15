public class DSA_Q7 {
	    public static int findMin(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] > nums[right]) {
	                // Minimum element is in the right half
	                left = mid + 1;
	            } else if (nums[mid] < nums[right]) {
	                // Minimum element is in the left half or at mid
	                right = mid;
	            } else {
	                // Duplicate elements, decrement right pointer
	                right--;
	            }
	        }

	        return nums[left];
	    }

	    public static void main(String[] args) {
	        int[] nums = {4, 5, 6, 7, 0, 1, 2};

	        int min = findMin(nums);

	        System.out.println("Minimum element: " + min);
	    }
	}
