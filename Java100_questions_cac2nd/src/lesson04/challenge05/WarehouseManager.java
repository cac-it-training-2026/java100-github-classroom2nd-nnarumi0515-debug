/**
 * 第4章 倉庫番のお仕事
 *
 * 問題5  袋の中身を調べる【改訂版】
 *
 * AB興産から預かっている荷物を再び検査することになりました。
 * 荷物は全部で5袋あり、その中で数値の5が入っている袋が
 * 何袋目なのかを調べなければなりません。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらに今回はそれぞれの袋の値が重複しないものとします。
 * （つまり、5が入っている袋はただ一つだけ）
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の検査結果を教えてください。
 *
 *  Yさん：
 *  はい、
 *  【※ここに値を出力】袋目
 *  に入っていました。
 *
 */

package lesson04.challenge05;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに配列の宣言を記述する
		int[] ABArray = new int[5];//整数型の配列ABArrayを宣言（要素数５）

		int intputNum = 0;
		boolean loopFlag = false;//重複なし

		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < ABArray.length; i++) {//5回繰り返しして1～5までの整数を重複しないようにランダムで代入する
			do {
				loopFlag = false;//重複なし
				intputNum = (int) (Math.random() * 10) % 5 + 1;//1-5のランダムな数字生成

				for (int j = 0; j < ABArray.length; j++) {
					if (ABArray[j] == intputNum) {//もし生成した数値が配列と
						loopFlag = true;//重複が見つかった場合再生成
						break;//処理中断whileの判定

					}

				}

			} while (loopFlag);//重複がある限り繰り返す

			ABArray[i] = intputNum;//重複していない値を格納

		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の検査結果を教えてください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");

		//ここに要素の確認および何袋目かの出力処理を記述する
		for (int i = 0; i < ABArray.length; i++) {//配列の先頭から5があるか確認する
			if (ABArray[i] == 5) {//配列の要素が５の時
				System.out.println((i + 1) + "袋目");//出力
				break;//繰り返し終了、出力処理

			}

		}

		System.out.println("に入っていました。");

	}
}
