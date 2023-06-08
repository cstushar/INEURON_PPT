import java.util.HashSet;
import java.util.Set;

public class DSA_Q2 {

	public static void main(String[] args) {

		int[] candyType = { 1, 1, 2, 2, 3, 3 };

		Set<Integer> candySet = new HashSet<>();

		for (Integer candy : candyType) {

			candySet.add(candy);
			if (candySet.size() >= candyType.length / 2) {
				break;
			}
		}
		
		System.out.println(Math.min(candySet.size(), candyType.length / 2));
	}

}
