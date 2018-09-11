package Report15;

public class Report15_07 {
	public static void main(String[] args) {
		int[][] n = { { 1, 7 }, { 2, 9, 5, 1 }, { 3, 3, 8 } };
		int sum = calcSum(n);
		System.out.println(sum);
	}

	public static int calcSum(int[][] n) {
		int sum = 0;
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				sum += n[i][j];
			}
		}
		return sum;
	}

}
