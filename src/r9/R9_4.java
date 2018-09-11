package r9;

public class R9_4 {
	public static void main(String[] args) {
		int[] score = { 32, 61, 77, 48, 51, 49, 15, 69, 98, 100 };
		int[] count = new int[5];

		for(int i = 0; i < score.length; i++) {
			if(score[i] < 20) {
				count[0] += 1;
			} else if(score[i] < 40) {
				count[1] += 1;
			} else if(score[i] < 60) {
				count[2] += 1;
			} else if(score[i] < 80) {
				count[3] += 1;
			} else if(score[i] <= 100) {
				count[4] += 1;
			}
		}

		for(int i = 0; i < count.length; i++) {
			for(int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
