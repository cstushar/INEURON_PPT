
public class DSA_Q1 {

	public static void main(String[] args) {
		
		int n = 45;
		
		boolean result = PowerOfTwo(n);
		System.out.println(result);
	}

	private static boolean PowerOfTwo(int n) {
		
		if(n == 1 ) {
			return true;
		}
		if(n%2 == 0) {
			return true;
		}
		
		PowerOfTwo(n/2);
		return false;
	}

}
