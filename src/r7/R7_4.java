package r7;

public class R7_4 {
	public static void main(String[] args) {
		double pi = 1.0;
		int demon1 = 3;
		int demon2 = 5;

		int i = 0;
		do {
			pi -= 1.0 / demon1;
			pi += 1.0 / demon2;
			demon1 += 4;
			demon2 += 4;
			i++;
		} while(i < 100000);
		pi *= 4;
		System.out.println(pi);
	}

}
