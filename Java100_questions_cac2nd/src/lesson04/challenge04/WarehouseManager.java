/**
 * 第4章 倉庫番のお仕事
 *
 * 問題4  袋の中身を調べる
 *
 * 正式に配属になったYさん。
 * 初めての仕事は、AB興産から預かっている荷物の検査です。
 * 荷物は全部で5袋あり、その中で数値の5が入っている袋が
 * 何袋目なのかを調べなければなりません。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * （全部に5が入ってることもあれば、
 *   5が入っている袋が1袋もない場合もある）
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <発見できた場合の実行例>
 *  E主任：
 *  AB興産の荷物の検査結果を教えてください。
 *
 *  Yさん：
 *  はい、
 *  【※ここに値を出力】袋目
 *  【※ここに値を出力】袋目
 *  に入っていました。
 *
 * <発見できなかった場合の実行例>
 *  E主任：
 *  AB興産の荷物の検査結果を教えてください。
 *
 *  Yさん：
 *  はい、
 *  入っていませんでした。
 *
 */

package lesson04.challenge04;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに配列の宣言および値の代入処理を記述する（for文）
		int ABArray[] = new int[5];//int型の配列ABArray宣言（要素数５）
		for (int i = 0; i < ABArray.length; i++) {//iの初期値０、配列の要素未満まで1ずつ増加（5回繰り返し）
			ABArray[i] = (int) (Math.random() * 10) % 5 + 1;//0～10の数字を5で割った余り0～4に1足すことで1～5の数字出力し、int型にキャストしたものを配列に格納

		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の検査結果を教えてください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");

		boolean hitFlag = false;//条件を満たさないと判定

		//ここに要素の確認および何袋目かの出力処理を記述する
		for (int i = 0; i < ABArray.length; i++) {//iの初期値０、配列の要素未満まで1ずつ増加（5回繰り返し）
			if (ABArray[i] == 5) {//配列に格納されている数字が5のとき
				hitFlag = true;//条件を満たす
				System.out.println((i + 1) + "袋目");//何袋目か出力

			}

		}

		if (hitFlag) {//上記for文でhit Flagがtrueの時
			System.out.println("に入っていました。");
		} else {
			System.out.println("入っていませんでした。");
		}

	}
}
