
public class Dsa_Q5 {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		int j = 0;

		for (int i = 0; i < m+n; i++) {
			if(nums1[i]==0) {
				nums1[i] = nums2[j];
				j++;
			}
			
		}
		System.out.print("nums1: [");
		for (int i = 0; i < nums1.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(nums1[i]);
		}
		System.out.println("]");
	}

	
}
