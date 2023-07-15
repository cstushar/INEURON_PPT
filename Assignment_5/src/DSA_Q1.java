
public class DSA_Q1 {

	    public static int[][] convertTo2D(int[] original, int m, int n) {
	        if (original.length != m * n) {
	            return new int[0][0];
	        }

	        int[][] result = new int[m][n];
	        int index = 0;

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                result[i][j] = original[index++];
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] original = {1, 2, 3, 4};
	        int m = 2;
	        int n = 2;

	        int[][] converted = convertTo2D(original, m, n);

	        System.out.println("Converted 2D array:");
	        for (int[] row : converted) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
	}
