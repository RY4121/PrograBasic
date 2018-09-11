package r7;

//もしsumに足した回数が知りたいのであれば、数列の一般項を求めてifの中で分岐させることで解決できる
//なぜなら数列の中では常に番号は今回のように1ずつ増えるからである
public class R7_2_2 {
	public static void main(String[] args) {
		int sum = 0;

		int i = 1;
		while(sum < 820) {
			sum += i;
			if(sum >= 820) {
				System.out.println(i);
			}
			i += 1;
		}

	}

}
