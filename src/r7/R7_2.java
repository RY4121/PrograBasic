package r7;

public class R7_2 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;

		/* while(sum < 820) {
		 * sum += n;
		 * if(sum < 820) {
		 * n++;
		 * }
		 * } */

		while(sum < 820) {
			n++;
			sum += n;
		}
		System.out.println(n);
		System.out.println(39 * 40 / 2);
	}

}
