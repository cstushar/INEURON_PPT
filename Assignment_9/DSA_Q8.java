
public class DSA_Q8 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		//int arr[] = {1,6,3};
		
		int result = ProductOfAll(arr,arr.length-1);
		System.out.println(result);
	}

	private static int ProductOfAll(int[] arr , int n) {
		if(n ==0) {
			return 1;
		}
		
		return arr[n] * ProductOfAll(arr , n-1);
	}

}
