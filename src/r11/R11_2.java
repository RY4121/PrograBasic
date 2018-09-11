package r11;

public class R11_2 {
	public static void main(String[] args) {
		int[] data = { 53, 13, 24, 9, 38 };

		System.out.print("偶数：");
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 2 == 0) {
				System.out.print(data[i] + "\t");
			}
		}
		//""の中に改行タブを加えてしまうと二重に改行してしまう
		System.out.println("");
		//やるならこっち！
		//System.out.print("\n");

		System.out.print("奇数：");
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 2 != 0) {
				System.out.print(data[i] + " ");
			}
		}
	}

}
