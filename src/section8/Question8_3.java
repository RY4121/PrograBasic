package section8;

public class Question8_3 {
	public static void main(String[] args) {
		int[][] score = { { 53, 85, 72 }, { 63, 55, 93 } };

		int[] sum = new int[score[0].length];

		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum[j] += score[i][j];
			}
		}

		double[] average = new double[score[0].length];
		for(int j = 0; j < score[0].length; j++) {
			average[j] = (double) sum[j] / score.length;
			System.out.println((j + 1) + "回目のテスト:" + average[j] + "点");
		}
	}

}
