
import java.util.HashMap;
import java.util.Map;

public class DSA_Q3 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };

		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Count the frequency of each number
		for (int num : nums) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		int maxLen = 0;

		// Check for harmonious subsequences
		for (int num : frequencyMap.keySet()) {
			if (frequencyMap.containsKey(num + 1)) {
				int currentLen = frequencyMap.get(num) + frequencyMap.get(num + 1);
				maxLen = Math.max(maxLen, currentLen);
			}
		}

		System.out.println(maxLen);

	}
}