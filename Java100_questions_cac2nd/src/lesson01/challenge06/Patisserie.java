/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		int chocobuy = Integer.parseInt(chocolateStr);

		System.out.println("ピスターシュ　　＞");
		String pistacheStr = reader.readLine();
		int pistabuy = Integer.parseInt(pistacheStr);

		System.out.println("シトロン　　　" + citronbuy + "個");
		System.out.println("ショコラ　　　" + chocobuy + "個");
		System.out.println("ピスターシュ　" + pistabuy + "個");

		System.out.println("\n合計個数" + (citronbuy + chocobuy + pistabuy) + "個");
		System.out.println("合計金額" + (250 * citronbuy + 280 * chocobuy + 320 * pistabuy) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		num1 = num1 - citronbuy;//num1（シトロン在庫）に「30-citronbuy（シトロンの購入数）」代入
		num2 = num2 - chocobuy;
		num3 = num3 - pistabuy;

		System.out.println("\n本日のおすすめの商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + num1 + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + num2 + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + num3 + "個");

	}

}
//
