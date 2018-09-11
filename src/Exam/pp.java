package Exam;

public class pp {
	//配列をDeepCopyしたときの実行結果の様子
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = new int[3];
		for(int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}

		a[1] = 188;
		for(int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}
	}
}