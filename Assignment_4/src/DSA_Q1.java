import java.util.ArrayList;
import java.util.List;

public class DSA_Q1 {

	    public static List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
	        List<Integer> result = new ArrayList<>();
	        int i = 0, j = 0, k = 0;

	        while (i < arr1.length && j < arr2.length && k < arr3.length) {
	            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
	                result.add(arr1[i]);
	                i++;
	                j++;
	                k++;
	            } else {
	                int minVal = Math.min(Math.min(arr1[i], arr2[j]), arr3[k]);
	                if (arr1[i] == minVal) {
	                    i++;
	                }
	                if (arr2[j] == minVal) {
	                    j++;
	                }
	                if (arr3[k] == minVal) {
	                    k++;
	                }
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {1, 2, 5, 7, 9};
	        int[] arr3 = {1, 3, 4, 5, 8};

	        List<Integer> common = commonElements(arr1, arr2, arr3);

	        System.out.println("Common elements: " + common);
	    }
	}
