package finalExam;

public class Question16 {
	public static void main(String[] args) {
		int[][] scr = { { 56, 74 }, { 78, 64 }, { 84, 80 } };
		double[] sum = new double[scr.length];
		double[] ave = new double[scr.length];

		for(int i = 0; i < scr.length; i++) {
			for(int j = 0; j < scr[i].length; j++) {
				sum[i] += scr[i][j];
			}
			ave[i] = sum[i] / scr[i].length;
		}
		for(int i = 0; i < ave.length; i++) {
			System.out.println((i + 1) + "回目：" + ave[i]);
		}
	}

}
