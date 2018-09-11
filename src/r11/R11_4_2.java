package r11;

public class R11_4_2 {
	public static void main(String[] args) {
		int[][] score = { { 83, 52, 65, 77, 21 }, { 84, 75, 32, 15, 28 } };

		//それぞれの回の平均点を求めるプログラム
		//step1:合計点を求める
		int[] sum = new int[2];
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];
			}
		}

		double[] average = new double[2];
		//step2:平均点を求める
		for(int i = 0; i < score.length; i++) {
			average[i] = (double) sum[i] / score[i].length;
		}

		//本題
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "回目のテスト:");//ポイント１
			for(int j = 0; j < score[i].length; j++) {
				if(score[i][j] >= average[i]) {
					System.out.print((j + 1) + " ");//ポイント２
				}
			}
			System.out.println();
		}
	}
}
