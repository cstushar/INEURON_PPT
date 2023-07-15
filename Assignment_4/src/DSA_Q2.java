import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DSA_Q2 {

	    public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
	        List<List<Integer>> answer = new ArrayList<>();
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();

	        for (int num : nums1) {
	            set1.add(num);
	        }

	        for (int num : nums2) {
	            set2.add(num);
	        }

	        Set<Integer> distinctNums1 = new HashSet<>(set1);
	        distinctNums1.removeAll(set2);

	        Set<Integer> distinctNums2 = new HashSet<>(set2);
	        distinctNums2.removeAll(set1);

	        answer.add(new ArrayList<>(distinctNums1));
	        answer.add(new ArrayList<>(distinctNums2));

	        return answer;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 3};
	        int[] nums2 = {2, 4, 6};

	        List<List<Integer>> distinctIntegers = findDistinctIntegers(nums1, nums2);

	        System.out.println("Distinct integers: " + distinctIntegers);
	    }
	}
