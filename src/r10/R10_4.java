package r10;

public class R10_4 {
	public static void main(String[] args) {
		int[][] score = { { 64, 81, 45, 81 }, { 98, 79, 88, 73 },
				{ 65, 78, 89, 78 } };
		int[] max = new int[3];

		for(int i = 0; i < score.length; i++) {

			for(int j = 0; j < score[i].length; j++) {
				if(score[i][j] > max[i]) {
					max[i] = score[i][j];
				}
				//System.out.print(max[j]);
			}
			System.out.print((i + 1) + "回目のテストの最高点：" + max[i]);
			System.out.println();
		}
	}

}
