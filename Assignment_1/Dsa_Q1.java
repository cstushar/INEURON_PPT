
public class Dsa_Q1 {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 13 };
		int target = 9;

		int[] ans = findValue(arr, target);
		if (ans != null) {
			System.out.println("Those numbers matched with the target value are at index : ");
			for (int elem : ans) {
				System.out.print(elem + " ");
			}
		} else {
			System.out.println("Invalid Input");
		}
	}

	static int[] findValue(int[] arr, int target) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == target) {
					int[] ans = { i, j };
					return ans;
				}
			}
		}
		return arr = null;
	}

}
