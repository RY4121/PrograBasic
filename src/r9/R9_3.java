package r9;

public class R9_3 {
	public static void main(String[] args) {
		int[] a = { 8, 2, 6 };
		int[] b = { 10, 7, 11 };
		int inPro = 0;

		for(int i = 0; i < a.length; i++) {
			inPro += a[i] * b[i];
		}
		System.out.println(inPro);
	}

}
