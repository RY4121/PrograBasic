package Exam;

public class Exam14 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		double[] b = { 3.3, 4.4 };
		for(int i = 0; i < b.length; i++) {
			b[i] = toDouble(b[i]);
			System.out.print(b[i]);
		}
	}

	public static int toDouble(int n) {
		return n * 2;
	}

	public static double toDouble(double n) {
		return n * 2;
	}

}
