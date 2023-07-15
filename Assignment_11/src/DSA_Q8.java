import java.util.*;
public class DSA_Q8 {

	    public static int[] intersect(int[] nums1, int[] nums2) {
	        Map<Integer, Integer> freqMap = new HashMap<>();
	        List<Integer> intersectionList = new ArrayList<>();
	        
	        // Count frequencies of elements in nums1
	        for (int num : nums1) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }
	        
	        // Check for intersection and decrement frequencies in nums2
	        for (int num : nums2) {
	            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
	                intersectionList.add(num);
	                freqMap.put(num, freqMap.get(num) - 1);
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
	        int[] intersection = intersect(nums1, nums2);
	        
	        System.out.println("Intersection:");
	        for (int num : intersection) {
	            System.out.print(num + " ");
	        }
	    }
	}

