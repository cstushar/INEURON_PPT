
public class DSA_Q2 {

	    public static int arrangeCoins(int n) {
	        // Solve the quadratic equation (k * (k + 1)) / 2 = n
	        // k^2 + k - 2n = 0
	        // Solve using the quadratic formula: k = (-1 + sqrt(1 + 8n)) / 2
	        return (int) ((Math.sqrt(1 + 8L * n) - 1) / 2);
	    }

	    public static void main(String[] args) {
	        int n = 5;
	        int completeRows = arrangeCoins(n);
	        System.out.println("Number of complete rows: " + completeRows);
	    }
	}
