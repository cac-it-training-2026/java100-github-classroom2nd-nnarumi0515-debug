/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題11 Stringクラス③（indexOf）
 *
 * 宇宙船が次の目的地γ星に到着しました。
 * γ星は不思議な星です。γ星人たちは
 * 名前に数字が入っているものを珍重しています。
 * 例えば、「アリナミン5」は大事にしていますが
 * 「アリナミンEX」は大事にしていません。
 *
 * γ星人クラスGammalianを新たに作成してください。
 * GammalianはString型フィールドitem、boolean型フィールドisGood
 * を持ち、メソッドsetItem()で登録します。setItem()は文字列中に
 * 数字が含まれていれば、isGoodをtrueにした後にitemに登録し、
 * 含まれていなければ、isGoodをfalseにした後に登録します。
 *
 * <実行例1>
 *
 * γ星人にアイテムを渡してください＞TanquerayNo.10
 *
 * γ星人：
 * こんな良いものをもらっていいガンマか！
 * ゆっくりしていくガンマ。
 *
 * <実行例2>
 *
 * γ星人にアイテムを渡してください＞orange
 *
 * γ星人：
 * ...ありがとガンマ。
 * ぶぶ漬けでもいかがガンマか？
 *
 */

package lesson06.challenge11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにGammalianクラスを記述する
class Gammalian {

	private String item;//itemフィールド
	private boolean isGood;//boolean型のフィールド

	public String getItem() {
		return item;
	}

	public void setItem(String item) {//setterメソッド
		boolean isHit = false;//boolean型isHitにfalse代入（0～9の数字が見つかってない状態）
		for (int i = 0; i < 10; i++) {//10回繰り返す
			if (item.indexOf(Integer.toString(i)) != -1) {//Integer.toStringでiを文字列に変換
				//indexOf()で文字列itemの中に指定の文字列が最初に出現する位置を返す
				//見つからない時-1を返す
				isHit = true;//数字が見つかった時
				break;//ループ抜ける
			}
		}
		if (isHit) {//isHitがtrueの時
			isGood = true;//isGoodもtrue
		} else {
			isGood = false;
		}
		this.item = item;//クラスのフィールドに代入
	}

	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("γ星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Gammalian gammalian = new Gammalian();
		gammalian.setItem(present);

		boolean isGood = false;

		//ここに適切な処理を記述する
		isGood = gammalian.isGood();

		System.out.println("\nγ星人：");
		if (isGood) {
			System.out.println("こんな良いものをもらっていいガンマか！");
			System.out.println("ゆっくりしていくガンマ。");
		} else {
			System.out.println("...ありがとガンマ。");
			System.out.println("ぶぶ漬けでもいかがガンマか？");
		}
	}
}
