import java.util.*;

public class GameSystem {
    // 参加者名を記録
    String name;

    // ガラポン用の配列を用意
    ArrayList<Integer> ball = new ArrayList<Integer>();

    // ビンゴカード用の配列を用意
    ArrayList<Integer> B = new ArrayList<Integer>();
    ArrayList<Integer> I = new ArrayList<Integer>();
    ArrayList<Integer> N = new ArrayList<Integer>();
    ArrayList<Integer> G = new ArrayList<Integer>();
    ArrayList<Integer> O = new ArrayList<Integer>();

    // ビンゴしたかチェックする用の値
    // この値が1になればビンゴが発生したことを表す
    int check = 0;

    public void ballset() {
        // 1~75のボールを準備
        for (int i = 1; i < 76; i++) {
            ball.add(i);
        }
    }

    public void bingomahine() {
        if (check == 0) {
            // ball配列の総数以下のランダムな値を生成
            int set = (int)(Math.random() * ball.size());
            // ball配列のset番目の値をbinNoに代入
            int binNo = ball.get(set);
            // 値の表示
            System.out.println("数字は " + binNo + " です");
            // ball配列からset番目の値を削除
            ball.remove(set);
            
            // ヒットしていれば、該当の値を0に変更
            for (int i = 0; i < 5; i++) {
                if (B.get(i) == binNo ) {
                    B.set(i, 0);
                    System.out.println("ヒット！");
                } else if (I.get(i) == binNo) {
                    I.set(i, 0);
                    System.out.println("ヒット！");
                } else if (N.get(i) == binNo) {
                    N.set(i, 0);
                    System.out.println("ヒット！");
                } else if (G.get(i) == binNo) {
                    G.set(i, 0);
                    System.out.println("ヒット！");
                } else {
                    if (O.get(i) == binNo) {
                        O.set(i, 0);
                        System.out.println("ヒット！");
                    }
                }
            }
        } else {
            System.out.println("ビンゴ！！！");
        }
    }

    public void bingocard() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 1; i < 76; i++) {
            num.add(i);
        }
    
        for (int i = 0; i < 75; i++) {
            int set = (int)(Math.random() * num.size());
            int binNo = num.get(set);
    
            // 配列に入れていく
            if (binNo < 16) {
                if (B.size() < 5) {
                    B.add(binNo);
                }
            } else if (binNo < 31) {
                if (I.size() < 5) {
                    I.add(binNo);
                }
            } else if (binNo < 46) {
                if (N.size() < 5) {
                    // 中央に0を入れる
                    if (N.size() == 2) {N.add(0);}
                    N.add(binNo);
                }
            } else if (binNo < 61) {
                if (G.size() < 5) {
                    G.add(binNo);
                }
            } else {
                if (O.size() < 5) {
                    if (binNo < 76) {
                        O.add(binNo);
                    }
                }
            }
    
            num.remove(set);
    
            if(B.size() == 5 && I.size() == 5 && N.size() == 5 &&
            G.size() == 5 && O.size() == 5) {
                break;
            }
        }
    }

    public void bingocardshow() {
        // ビンゴカードを表示する
        System.out.println(name + "さんのビンゴカード");
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("| " + B.get(i) + " | " + I.get(i) + " | " + N.get(i) +
                            " | " + G.get(i) + " | " + O.get(i) + " |");
            System.out.println("-------------------------");
        }
    }

    public void bingocheck() {
        // ビンゴしているかチェックする
        // 縦方向
        if (B.get(0) == 0 && B.get(1) == 0 && B.get(2) == 0 && B.get(3) == 0 && B.get(4) == 0) {
            check = 1;
        } else if (I.get(0) == 0 && I.get(1) == 0 && I.get(2) == 0 && I.get(3) == 0 && I.get(4) == 0) {
            check = 1;
        } else if (N.get(0) == 0 && N.get(1) == 0 && N.get(2) == 0 && N.get(3) == 0 && N.get(4) == 0) {
            check = 1;
        } else if (G.get(0) == 0 && G.get(1) == 0 && G.get(2) == 0 && G.get(3) == 0 && G.get(4) == 0) {
            check = 1;
        } else if (O.get(0) == 0 && O.get(1) == 0 && O.get(2) == 0 && O.get(3) == 0 && O.get(4) == 0) {
            check = 1;
        // 横方向
        } else if (B.get(0) == 0 && I.get(0) == 0 && N.get(0) == 0 && G.get(0) == 0 && O.get(0) == 0) {
            check = 1;
        } else if (B.get(1) == 0 && I.get(1) == 0 && N.get(1) == 0 && G.get(1) == 0 && O.get(1) == 0) {
            check = 1;
        } else if (B.get(2) == 0 && I.get(2) == 0 && N.get(2) == 0 && G.get(2) == 0 && O.get(2) == 0) {
            check = 1;
        } else if (B.get(3) == 0 && I.get(3) == 0 && N.get(3) == 0 && G.get(3) == 0 && O.get(3) == 0) {
            check = 1;
        } else if (B.get(4) == 0 && I.get(4) == 0 && N.get(4) == 0 && G.get(4) == 0 && O.get(4) == 0) {
            check = 1;
        // 斜め方向
        } else if (B.get(0) == 0 && I.get(1) == 0 && N.get(2) == 0 && G.get(3) == 0 && O.get(4) == 0) {
            check = 1;
        } else if (B.get(4) == 0 && I.get(3) == 0 && N.get(2) == 0 && G.get(1) == 0 && O.get(0) == 0) {
            check = 1;
        } else {
            
        }
    }



    public void gamestart() {
        System.out.println("ゲームを開始します");
        System.out.print("名前を入力してください：");
        name = PConsole.inputString();
        bingocardshow();
        System.out.println("エンターキーを押すたびにゲームが進行します");
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {
            bingomahine();
            bingocardshow();
            bingocheck();

            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }

            if(check == 1) {
                System.out.println("ビンゴ！！！");
                break;
            }
        }
    }
}