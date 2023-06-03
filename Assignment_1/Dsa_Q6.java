
public class Dsa_Q6 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 ,1};
		boolean flag = false;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					flag = true;
					break;
				}
			}
		}
		
		if(flag != true) {
			System.out.println("This array is distinct");
		}
		else {
			System.out.println("This array contains duplicate numbers");
		}
		

	}

}
