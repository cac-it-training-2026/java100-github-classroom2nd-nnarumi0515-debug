/**
 * 第4章 倉庫番のお仕事
 *
 * 問題7 荷物の並べ替え（昇順、降順）
 *
 * AB興産からの次の依頼は、昇順、降順による並べ替えです。
 * 5袋ある荷物を中の値によって、小さい順に並べ替えて表示した後、
 * 大きい順に並べ替えて表示します。
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
 *  AB興産の荷物の並べ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  並べ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  小さい順に並べ替えた後の状態は、
 *  1,2,3,4,5
 *  です。
 *
 *  大きい順に並べ替えた後の状態は、
 *  5,4,3,2,1
 *  です。
 *
 */

package lesson04.challenge07;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];

		//ここに重複チェックおよび値の代入処理を記述する
		int inputNum = 0;//整数型のinputNumに0を代入する
		boolean loopFlag = false;//重複なし
		for (int i = 0; i < ABKosanArray.length; i++) {//5回繰り返しして1～5までの整数を重複しないようにランダムで代入する
			do {
				loopFlag = false;//重複なし
				inputNum = (int) (Math.random() * 10) % 5 + 1;//1-5のランダムな数字生成

				for (int j = 0; j < ABKosanArray.length; j++) {
					if (ABKosanArray[j] == inputNum) {
						loopFlag = true;//もし生成した数値が配列と重複が見つかった場合再生成
						break;//処理中断whileの判定

					}

				}

			} while (loopFlag);//重複がある限り繰り返す

			ABKosanArray[i] = inputNum;//重複していない値を格納

		}

		for (int i = 0; i < ABKosanArray.length; i++) {

		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の並べ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("並べ替え前の状態は、");

		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに昇順にソートする処理を記述する
		for (int i = 0; i < ABKosanArray.length - 1; i++) {//i=0から4回繰り返す
			for (int j = i + 1; j < ABKosanArray.length; j++) {//j=1からｊ＜５まで繰り返す
				if (ABKosanArray[i] > ABKosanArray[j]) {//もしiの要素がjの要素よりも大きいとき
					int temp = ABKosanArray[i];//iの要素を整数型のtempに代入する
					ABKosanArray[i] = ABKosanArray[j];//iの要素にjの要素を代入する
					ABKosanArray[j] = temp;//jの要素にtempに代入していたiの要素入れる
				}
			}
		}

		System.out.println("小さい順に並べ替えた後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		//ここに降順にソートする処理を記述する
		for (int i = 0; i < ABKosanArray.length - 1; i++) {//iを0から4まで5回繰り返す
			for (int j = i + 1; j < ABKosanArray.length; j++) {//ｊを1から４まで4回繰り返す
				if (ABKosanArray[i] < ABKosanArray[j]) {//添え字iの要素が添え字jの要素よりも小さいとき
					int temp = ABKosanArray[i];//tempにiの要素代入する
					ABKosanArray[i] = ABKosanArray[j];//iのにjの値を代入する
					ABKosanArray[j] = temp;//j
				}
			}
		}

		System.out.println("大きい順に並べ替えた後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");
	}
}
