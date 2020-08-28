import java.util.*;

public class GameSystem {
    // ガラポン用の配列を用意
    ArrayList<Integer> ball = new ArrayList<Integer>();
    static int binNo;

    // 1~75のボールを準備
    public void ballset() {
        for (int i = 1; i < 76; i++) {
            ball.add(i);
        }
    }

    // ボールを1個排出
    public int bingomahine() {
        // ball配列の総数以下のランダムな値を生成
        int set = (int)(Math.random() * ball.size());
        // ball配列のset番目の値をbinNoに代入
        binNo = ball.get(set);
        // 値の表示
        System.out.println("数字は " + binNo + " です");
        // ball配列からset番目の値を削除
        ball.remove(set);
        return binNo;
    }

}