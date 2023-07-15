import java.util.*;
public class DSA_Q5 {

	    public static int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
	        List<Integer> intersectionList = new ArrayList<>();
	        
	        // Add all unique elements of nums1 to the set
	        for (int num : nums1) {
	            set.add(num);
	        }
	        
	        // Check for intersection in nums2
	        for (int num : nums2) {
	            if (set.contains(num)) {
	                intersectionList.add(num);
	                set.remove(num); // Remove the element from set to avoid duplicates
	            }
	        }
	        
	        // Convert the list to an array
	        int[] intersectionArray = new int[intersectionList.size()];
	        for (int i = 0; i < intersectionList.size(); i++) {
	            intersectionArray[i] = intersectionList.get(i);
	        }
	        
	        return intersectionArray;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 2, 1};
	        int[] nums2 = {2, 2};
	        int[] intersection = intersection(nums1, nums2);
	        
	        System.out.println("Intersection:");
	        for (int num : intersection) {
	            System.out.print(num + " ");
	        }
	    }
	}
