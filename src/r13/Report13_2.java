package r13;

public class Report13_2 {
	public static void main(String[] args) {
		System.out.println(getTax(444, 0.115));
	}

	public static int getTax(int price, double rate) {
		return (int) (price * rate);
	}
}
