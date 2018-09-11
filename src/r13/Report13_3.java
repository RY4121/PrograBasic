package r13;

public class Report13_3 {
	public static void main(String[] args) {
		int[] score = { 77, 34, 51, 23, 15, 98 };
		System.out.println(getSum(score));
	}

	public static int getSum(int[] score) {
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
}
