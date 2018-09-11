package Exam;

public class Exam13 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = a;
		a[2] += 1;
		System.out.println(a[2] + b[2]);
	}

}
