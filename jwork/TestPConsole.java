import java.io.*;
import java.util.Random;
/*
 * コンソール入出力用クラス のテスト用クラス
 *
 * copyright:Nakamura,Atsushi
 *
 * ver.1.00 2018-07-13.0833
 * ver.1.01 2020-01-19.1616
 */
class TestPConsole {
	public static void main(String[] args) {
		// 使用例：整数入力
		int num = PConsole.inputIntNum();
		System.out.println(num);

		// 使用例：整数入力。範囲付き
		num = PConsole.inputIntNum(0,18);
		System.out.println(num);

		// 使用例：文字列入力
		String str = PConsole.inputString();
		System.out.println(str);

		// 使用例：ランダムな値の配列を取得
		int[] array;
		int cnt = 0;
		int maxSetting = 0;
		int minSetting = 0;

		// 使用例：整数入力
		System.out.println("ランダムな整数配列を作成します。最大値を入力してください");
		maxSetting = PConsole.inputIntNum();
		System.out.println(maxSetting);
		System.out.println("最小値を入力してください");
		minSetting = PConsole.inputIntNum();
		System.out.println(minSetting);
		System.out.println("要素数を入力してください");
		cnt = PConsole.inputIntNum();
		System.out.println(cnt);

		array = PConsole.createRandomIntArray(minSetting,  maxSetting,  cnt,  true);
		//                           最小値,最大値,要素数,表示/非表示

		// 要素数、最大値、最小値が指定内に収まっているかどうかどおりかどうか確認
		int max = array[0];
		int min = array[0];
		for (int i = 0 ; i < array.length ; i++) {
			if (max < array[i]) max = array[i];
			if (min > array[i]) min = array[i]; 
		}
		System.out.print("\n\n");

		System.out.println("length = " + array.length);
		System.out.println("max = " + max + ":" + maxSetting);
		System.out.println("min = " + min + ":" + minSetting);

	}
}
	  
		
