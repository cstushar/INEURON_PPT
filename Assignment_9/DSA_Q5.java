
public class DSA_Q5 {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, -5, -4, 8, 6 };
		int result = findMax(arr);

		System.out.println(result);
	}

	public static int findMax(int[] arr) {
		return findMaxRecursive(arr, 0);
	}

	private static int findMaxRecursive(int[] arr, int index) {
		// Base case: If there is only one element, return it as the maximum
		if (index == arr.length - 1) {
			return arr[index];
		}

		// Recursive case: Find the maximum in the remaining elements
		int maxRemaining = findMaxRecursive(arr, index + 1);

		// Compare the current element with the maximum of the remaining elements
		return Math.max(arr[index], maxRemaining);
	}

}
