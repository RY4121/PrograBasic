package r11;

public class R11_4 {
	public static void main(String[] args) {
		//人数の把握がしやすいが、今は1人ではなく全体の回数による判定をしているので
		//配列の入れ方としては推奨されない
		int[][] score = { { 83, 84 }, { 52, 75 }, { 65, 32 }, { 77, 15 }, { 21, 28 } };
		int[] sum = new int[2];
		double[] average = new double[2];

		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum[j] += score[i][j];
			}
		}

		for(int j = 0; j < score[0].length; j++) {
			average[j] += (double) sum[j] / score.length;
		}

		System.out.print("1回目のテスト:");
		for(int i = 0; i < score.length; i++) {
			if(score[i][0] >= average[0]) {
				System.out.print((i + 1) + " ");
			}
		}

		System.out.println();

		System.out.print("2回目のテスト:");
		for(int i = 0; i < score.length; i++) {
			if(score[i][1] >= average[1]) {
				System.out.print((i + 1) + " ");
			}
		}

	}

}
