package section7;

public class Question7_10 {
	/* public static void main(String[] args) {
	 * int k = 220;
	 * System.out.print("素因数：");
	 *
	 * for(int i = 2; i <= k; i++) {
	 * if(k % i == 0) {
	 * for(int j = 2; j <= i; j++) {//更新条件が満たされるようにしないとfor文の中は実行されない
	 * if(i == j) {
	 * //System.out.println(i);
	 *
	 * System.out.print(i + "*");
	 *
	 * } else if(i % j == 0) {//割り切れた時の処理
	 * //do nothing
	 * break;
	 * //continueの場合も同様に以下の処理が棄却されてしまう
	 * //だが、for文を抜けないという点ではbreakとは異なる。
	 * }
	 *
	 * }
	 * }
	 * }
	 * }
	 * } */
	public static void main(String[] args) {
		int n = 220;
		System.out.print("素因数：");
		//素数で割るという処理を考えなくとも、小さい文字から順々に割っていると、自動的に素数でしか割れなくなる
		//例えば、４で割られる前に２で割れるし９で割る前に３で割られるといった風に素数でない数は必ず素因数分解できるという性質を利用する
		//但しdo-while文の中でｎが更新されているのでi=nのとき（素因数の最後の文字）を描画する処理を別途用意する必要がある
		for(int i = 2; i <= n; i++) {
			if(i == n) {//最後の文字描画用
				System.out.print(n);
				break;
			} else if(n % i == 0) {
				do {
					n /= i;//ｎがここで更新されていることに注意
					System.out.print(i + " ");
				} while(n % i == 0);
			}
		}

	}
}
