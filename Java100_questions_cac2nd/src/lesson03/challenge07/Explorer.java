
/**
 * 第3章 探検隊のお仕事
 *
 * 問題7  ワニが現れた
 *
 * 進行方向にワニが3匹現れました。
 * このワニはそれぞれグーワニ、チョキワニ、パーワニの何れかです。
 *
 * グーワニは手をパーかグーにして見せるとおとなしくなり、
 * チョキワニは手をグーかチョキにして見せるとおとなしくなり、
 * パーワニは手をチョキかパーにして見せるとおとなしくなるのですが、
 * この3種は外見がまったく一緒で見分けがつきません。
 * （つまり、3匹がそれぞれ1種ずつである場合も
 *   3匹ともグーワニである可能性もあります。）
 *
 * この道を通り抜けるためには、 3匹にそれぞれ勝つか引き分けるか
 * しなければなりません。負けるとその時点でチャレンジ終了となります。
 *
 * コメントの位置にwhile文とif文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  ワニ3匹発見！
 *  グーワニかチョキワニかパーワニのどれかです。
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞2
 *
 *  隊長：
 *  相手はチョキワニでした。
 *  1匹目通り抜け成功！
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞3
 *
 *  隊長：
 *  相手はグーワニでした。
 *  2匹目通り抜け成功！
 *
 *  隊長：
 *  どの手を出して通り抜けますか
 *  （グー… 1 : チョキ… 2 : パー… 3）＞1
 *
 *  隊長：
 *  相手はグーワニでした。
 *  3匹目通り抜け成功！
 *
 *  隊長：
 *  川を渡り切りました。
 *
 * <通り抜けに失敗した場合の実行例>
 *  隊長：
 *  相手はグーワニでした。
 *  通り抜けに失敗しました...
 *
 * <範囲外の手が入力された場合の実行例>
 *
 *  隊長：
 *  そんな手はありませんよ。もう一度入れてください。
 *
 */

package lesson03.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("ワニ3匹発見！\n");
		System.out.println("グーワニかチョキワニかパーワニのどれかです。\n");

		int alligator = 0;
		int hand = 0;
		int i = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//ここにwhile文、if文を利用した処理を記述
		while (i < 3) {//iが3未満まで繰り返す（3回）グー・チョキ・パーそれぞれ出した時のパターンを考える
			System.out.println("隊長：");
			System.out.println("どの手を出して通り抜けますか");
			System.out.println("（グー… 1 : チョキ… 2 : パー… 3）>");

			String handStr = br.readLine();
			hand = Integer.parseInt(handStr);

			alligator = (int) (Math.random() * 10 % 3) + 1;

			if (hand == 1) {//グーを出した時
				if (alligator == 1 || alligator == 2) {//ワニがグーもしくはチョキの時
					System.out.println("隊長：");
					String kind = (alligator == 1) ? "グーワニ" : "チョキワニ";//文字列型kindはalligatorが1の時"グーワニ”そうでないとき"チョキワニ”
					System.out.println("相手は" + kind + "でした。");
					System.out.println((i + 1) + "匹目の通り抜け成功！\n");

				} else {
					System.out.println("隊長：");
					System.out.println("相手はパーワニでした。");
					break;//while文を抜ける

				}

			} else if (hand == 2) {//チョキを出した時
				if (alligator == 2 || alligator == 3) {//ワニがチョキもしくはパーの時
					System.out.println("隊長：");
					String kind = (alligator == 2) ? "チョキワニ" : "パーワニ";//文字列型kindはalligatorが2の時"チョキワニ"そうでないとき"パーワニ"
					System.out.println("相手は" + kind + "でした。");
					System.out.println((i + 1) + "匹目の通り抜け成功！\n");

				} else {
					System.out.println("隊長：");
					System.out.println("相手はグーワニでした。");
					break;//while文抜ける

				}

			} else if (hand == 3) {//パーを出した時
				if (alligator == 3 || alligator == 1) {//ワニがパーもしくはグーの時
					System.out.println("隊長：");
					String kind = (alligator == 3) ? "パーワニ" : "グーワニ";//文字列型kindはalligatorが3の時パーワニ、そうでないときグーワニ
					System.out.println("相手は" + kind + "でした。");
					System.out.println((i + 1) + "匹目の通り抜け成功！\n");

				} else {
					System.out.println("隊長：");
					System.out.println("相手はチョキワニでした。");
					break;//while文抜ける

				}

			} else {//入力値1，2，3以外の時
				System.out.println("隊長：");
				System.out.println("そんな手はありませんよ。");

			}
			{

			}
			{

			}

		}

		if (i == 3) {//i==3の時while文抜け以下の処理
			System.out.println("隊長：");
			System.out.println("川を渡り切りました。");
		} else {
			System.out.println("通り抜けに失敗しました...");
		}

	}
}
