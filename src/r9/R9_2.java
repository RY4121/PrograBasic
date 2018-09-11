package r9;

public class R9_2 {
	public static void main(String[] args) {
		int[] score = { 64, 37, 99, 12, 85 };
		int min = score[0];
		int minN = 0;

		for(int i = 0; i < score.length; i++) {
			if(score[i] < min) {
				min = score[i];
				minN = i;
			}
		}
		System.out.println("最小値：" + "\t" + min);
		System.out.println("要素番号：" + minN);
	}
}
