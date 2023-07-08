import java.util.Arrays;

public class DSA_Q8 {
	
	
	public static void main(String[] args) {
		int [][] intervals = {{0,30},{5,10},{15,20}};
		System.out.println(canAttendMeetings(intervals));
	}

	public static boolean canAttendMeetings(int[][] intervals) {
		// Sort the intervals based on start time
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		// Iterate through the sorted intervals
		for (int i = 1; i < intervals.length; i++) {
			// Check for overlap
			if (intervals[i][0] < intervals[i - 1][1]) {
				return false;
			}
		}

		// No overlaps found
		return true;
	}
}
