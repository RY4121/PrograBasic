package section7;

public class Question7_9 {
	public static void main(String[] args) {

		/* for(int i = 2; i <= 1000; i++) {
		 * for(int j = 2; j <= i; j++) {//更新条件が満たされるようにしないとfor文の中は実行されない
		 * if(i % j == 0) {//割り切れた時の処理
		 * //do nothing
		 * break;
		 * } else if(i == j) {
		 * System.out.println(i);
		 * }
		 * }
		 * } */

		/* for(int i = 2; i <= 1000; i++) {
		 * for(int j = 2; j <= i; j++) {//更新条件が満たされるようにしないとfor文の中は実行されない
		 *
		 * if(i == j) {//割り切れずにjがiに到達した時の処理
		 * System.out.println(i);
		 * } else if(i % j == 0) {//割り切れた時の処理
		 * //do nothing
		 * break;//breakはそれ以降の処理を無効化するため、これがif文の中に存在すると
		 * //一度呼び出されるだけで、(i==j)のときの処理もなくなってしまう。
		 *
		 * }
		 * }
		 * } */

		for(int i = 2; i <= 1000; i++) {
			for(int j = 2; j <= i; j++) {//更新条件が満たされるようにしないとfor文の中は実行されない
				if(i % j == 0) {//割り切れた時の処理
					//do nothing
					continue;
					//continueの場合も同様に以下の処理が棄却されてしまう
					//だが、for文を抜けないという点ではbreakとは異なる。
				} else if(i == j) {
					System.out.println(i);

				}
			}
		}
	}
}