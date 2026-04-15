/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double citronbuy = Double.parseDouble(citronStr);//文字列を浮動小数点型に変更

		System.out.println("ショコラ　　　＞");
		String chocolateStr = reader.readLine();
		double chocobuy = Double.parseDouble(chocolateStr);

		System.out.println("ピスターシュ　　＞");
		String pistacheStr = reader.readLine();
		double pistabuy = Double.parseDouble(pistacheStr);

		System.out.println("シトロン　　　" + citronbuy + "個");
		System.out.println("ショコラ　　　" + chocobuy + "個");
		System.out.println("ピスターシュ　" + pistabuy + "個");

		double sum1 = citronbuy + chocobuy + pistabuy;//sum1購入数の合計
		int sum2 = (int) (250 * citronbuy + 280 * chocobuy + 320 * pistabuy);//sum2合計金額を整数型に変換

		System.out.println("合計個数" + sum1 + "個");
		System.out.println("合計金額" + sum2 + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		num1 = (int) (num1 - citronbuy);//num1（シトロン在庫）に整数型に変換したもの代入
		num2 = (int) (num2 - chocobuy);
		num3 = (int) (num3 - pistabuy);

		System.out.println("\n本日のおすすめの商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + num1 + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + num2 + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + num3 + "個");

	}

}
///
