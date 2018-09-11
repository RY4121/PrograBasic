package r10;

//配列の入れ方によっては解けない場合も存在する
public class R10_3_2 {
	public static void main(String[] args) {
		int[][] score = { { 64, 81, 45, 81 }, { 98, 79, 88, 73 },
				{ 65, 78, 89, 78 } };
		int[] max = new int[4];

		for(int i = 0; i < 3; i++) {
			max[i] = score[0][i];
		}

		for(int i = 0; i < score[0].length; i++) {

			for(int j = 0; j < score.length; j++) {
				if(max[i] < score[j][i]) {
					max[i] = score[j][i];
				}
			}
			System.out.println((i + 1) + "人目の学生の最高点：" + max[i]);
		}
	}

}
