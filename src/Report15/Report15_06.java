package Report15;

public class Report15_06 {
	public static void main(String[] args) {
		int a = 2;
		double b = 4.5;

		System.out.println(method(a));
		System.out.println(method(b));
		System.out.println(method(a, b));
	}

	public static int method(int a) {
		return a * 2;
	}

	public static double method(double a) {
		return a * 2;
	}

	public static double method(int a, double b) {
		return a + b;
	}

}
