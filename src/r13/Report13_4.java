package r13;

public class Report13_4 {
	public static void main(String[] args) {
		int[] score = { 77, 34, 51, 23, 15, 98 };
		System.out.println(getAverage(score));
	}

	public static double getAverage(int[] score) {
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return (double) sum / score.length;
	}

}
