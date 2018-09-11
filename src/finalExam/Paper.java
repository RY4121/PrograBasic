package finalExam;

public class Paper {
	public static void main(String[] args) {
		int x = 26;
		int y = 4;
		double z = 5.5;

		//１："x/y"はintとintの演算のため小数点以下は切り捨てられる⇒int型
		System.out.println("x" + x + z);
		System.out.println((double) x / y + z);//２：double型のxとint型のyの演算のため、x/yの結果はdoubleにあわされる
		System.out.println(x / y + z);/* ３：int型とdouble型の演算のためdouble型にあわされる。つまり
									   * (double)(x/y)+zという書き方は冗長的であり、無意味である */
		System.out.println((double) x / y);
	}
}
