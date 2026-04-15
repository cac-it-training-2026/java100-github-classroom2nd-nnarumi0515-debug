/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int num1;//整数型の変数num1
		num1 = 30;//num1に30を代入
		int num2;
		num2 = 30;
		int num3;
		num3 = 30;

		System.out.println("\n本日のおすすめの商品です。\n");

		System.out.println("シトロン　　　\\250・・・残り" + num1 + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + num2 + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + num3 + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		System.out.println("シトロン　　　＞");
		String citronStr = reader.readLine();//コンソール入力
		int citronbuy = Integer.parseInt(citronStr);//入力された文字列を整数型に変換

		System.out.println("ショコラ　　　＞");
		String chocolateStr = reader.readLine();
		int chocolatebuy = Integer.parseInt(chocolateStr);

		System.out.println("ピスターシュ　　＞");
		String pistacheStr = reader.readLine();
		int pistachebuy = Integer.parseInt(pistacheStr);

		System.out.println("シトロン　　　" + citronbuy + "個");
		System.out.println("ショコラ　　　" + chocolatebuy + "個");
		System.out.println("ピスターシュ　" + pistachebuy + "個");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
	}

}
//
