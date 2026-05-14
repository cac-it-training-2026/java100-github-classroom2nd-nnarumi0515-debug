/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];

		//ここに重複チェックおよび値の代入処理を記述する
		int intputNum = 0;
		boolean loopFlag = false;//重複なし

		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < ABKosanArray.length; i++) {//5回繰り返しして1～5までの整数を重複しないようにランダムで代入する
			do {
				loopFlag = false;//重複なし
				intputNum = (int) (Math.random() * 10) % 5 + 1;//1-5のランダムな数字生成

				for (int j = 0; j < ABKosanArray.length; j++) {
					if (ABKosanArray[j] == intputNum) {//もし生成した数値が配列と
						loopFlag = true;//重複が見つかった場合再生成
						break;//処理中断whileの判定

					}

				}

			} while (loopFlag);//重複がある限り繰り返す

			ABKosanArray[i] = intputNum;//重複していない値を格納

		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに値の入れ替え処理を記述する
		for (int i = 0; i < ABKosanArray.length; i++) {//iを配列の長さ繰り返す
			if (ABKosanArray[i] == 1) {//要素番号iの要素が１のとき
				for (int j = 0; j < ABKosanArray.length; j++) {//３を探す処理、j＝0から5まで繰り返し
					if (ABKosanArray[j] == 3) {//要素番号jの要素が3の時
						int temp = ABKosanArray[i];//整数型の仮の変数の箱を用意して１を入れる
						ABKosanArray[i] = ABKosanArray[j];//要素番号iの所に3を代入
						ABKosanArray[j] = temp;//要素番号ｊに仮の変数に入っていた1を代入し、入れ替え処理完了
						break;//処理中断

					}

				}

			}
			//上記と同様に２と4入れ替え処理
			if (ABKosanArray[i] == 2) {
				for (int j = 0; j < ABKosanArray.length; j++) {
					if (ABKosanArray[j] == 4) {
						int temp = ABKosanArray[i];
						ABKosanArray[i] = ABKosanArray[j];
						ABKosanArray[j] = temp;
						break;

					}

				}

			}

		}

		System.out.println("入れ替え後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
