package r11;

public class RR11_3 {
	public static void main(String[] rar) {
		int[][] score = { { 83, 84 }, { 52, 75 }, { 65, 32 }, { 77, 15 }, { 21, 28 } };
		int[] sum = new int[2];
		double[] average = new double[2];

		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum[j] += score[i][j];
			}
		}

		//for(int i=0; i<score.length; i++) {
		for(int j = 0; j < score[0].length; j++) {
			average[j] += (double) sum[j] / score.length;
			System.out.println((j + 1) + "回目のテストの平均点：" + average[j]);
		}
		//}

	}
}
