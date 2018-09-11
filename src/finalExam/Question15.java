package finalExam;

public class Question15 {
	public static void main(String[] atgs) {
		int[] a = { 1, 2, 3 };
		for(int i = 0; i < a.length; i++) {
			a[i] = toTriple(a[i]);
			System.out.print(a[i]);
		}
	}

	public static int toTriple(int num) {
		return num * 3;
	}

}
