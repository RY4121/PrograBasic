package finalExam;

public class Question11 {
	public static void main(String[] atgs) {
		int[] a = { 100, 250 };
		double[] b = { 1.2, 3.4 };
		for(int i = 0; i < a.length; i++) {
			writeData(a[i]);
			writeData(b[i]);
		}
	}

	public static void writeData(int n) {
		System.out.println(n + "円");
	}

	public static void writeData(double n) {
		System.out.println(n + "ドル");
	}
}
