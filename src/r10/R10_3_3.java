package r10;

public class R10_3_3 {
	public static void main(String[] args) {
		int[][] score = { { 64, 98, 65 }, { 81, 79, 78 }, { 45, 88, 89 }, { 81, 73, 78 } };
		int[] max = new int[4];

		for(int i = 0; i < score.length; i++) {
			max[i] = score[i][0];
			for(int j = 0; j < score[i].length; j++) {
				if(max[i] < score[i][j]) {
					max[i] = score[i][j];
				}
			}
			System.out.println((i + 1) + "人目の学生の最高点：" + max[i]);
		}
	}

}
