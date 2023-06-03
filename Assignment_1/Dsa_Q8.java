import java.util.HashSet;

public class Dsa_Q8 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 4 };
		HashSet set = new HashSet();

		int duplicate = 0;
		int missing = 0;

		for (int num : nums) {
			if (set.contains(num)) {
				duplicate = num;
			}
			set.add(num);
			missing += num;
		}

		int n = nums.length;
		missing = (n * (n + 1) / 2) - missing + duplicate;

		System.out.println("{" + duplicate + "," + missing + "}");

	}
}
