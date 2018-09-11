package Report15;

public class Report15_05 {
	public static void main(String[] args) {
		int[] a = { 4, 5, 6 };
		int[] b = { 1, 2, 3 };
		int[] c = b;
		int[] d = new int[3];

		for(int i = 0; i < d.length; i++) {
			d[i] = a[i] + b[i] + c[i];
			System.out.println(d[i]);
		}
	}

}
