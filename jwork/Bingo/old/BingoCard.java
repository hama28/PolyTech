import java.util.*;

public class BingoCard {

    public void bingocard() {
        ArrayList<String> B = new ArrayList<String>();
        ArrayList<String> I = new ArrayList<String>();
        ArrayList<String> N = new ArrayList<String>();
        ArrayList<String> G = new ArrayList<String>();
        ArrayList<String> O = new ArrayList<String>();
    
        B.add("B");
        I.add("I");
        N.add("N");
        G.add("G");
        O.add("O");
    
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 1; i < 76; i++) {
            num.add(i);
        }
    
        for (int i = 0; i < 75; i++) {
            int set = (int)(Math.random() * num.size());
            int binNo = num.get(set);
    
            // 配列に入れていく
            if (binNo < 16) {
                if (B.size() < 6) {
                    B.add(Integer.toString(binNo));
                }
            } else if (binNo < 31) {
                if (I.size() < 6) {
                    I.add(Integer.toString(binNo));
                }
            } else if (binNo < 46) {
                if (N.size() < 6) {
                    // 中央にFを入れる
                    if (N.size() == 3) {N.add("0");}
                    N.add(Integer.toString(binNo));
                }
            } else if (binNo < 61) {
                if (G.size() < 6) {
                    G.add(Integer.toString(binNo));
                }
            } else {
                if (O.size() < 6) {
                    if (binNo < 76) {
                        O.add(Integer.toString(binNo));
                    }
                }
            }
    
            num.remove(set);
    
            if(B.size() == 6 && I.size() == 6 && N.size() == 6 &&
            G.size() == 6 && O.size() == 6) {
                break;
            }
        }
    
        // ビンゴカードを表示する
        for (int i = 0; i < 6; i++) {
            System.out.println("| " + B.get(i) + " | " + I.get(i) + " | " + N.get(i) +
                            " | " + G.get(i) + " | " + O.get(i) + " |");
            System.out.println("-------------------------");
        }
    }
}