package r11;

public class R11_1 {
	public static void main(String[] rg) {
		int a = 3 * 4;
		int b = 0;
		for(int i = 0; i < 60 / a; i++) {
			b = a * (i + 1);
			System.out.println(b);
		}
	}
}
