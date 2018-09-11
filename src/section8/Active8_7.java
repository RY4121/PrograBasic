package section8;

public class Active8_7 {
	public static void main(String[] args) {
		int[] score = { 80, 50, 75 };
		int[] test;

		test = score;

		test[1] = 60;
		System.out.println("[score]");

		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println("[test]");
		for(int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}

}
