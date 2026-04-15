/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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

	}

}
