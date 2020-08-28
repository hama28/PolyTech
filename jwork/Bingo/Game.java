import java.util.*;

public class Game {
    public static void main(String[] args) {

        System.out.println("ゲームの準備を行います");
        System.out.print("何人で遊びますか？");
        int count = PConsole.inputIntNum();
        BingoCard man[] = new BingoCard[count];
        for (int i = 0; i < count; i++) {
            man[i] = new BingoCard();
        }
        // 参加人数分の名前の入力
        for (int i = 0; i < count; i++){
            System.out.print((i + 1) + "人目の名前を入力してください：");
            String name = PConsole.inputString();
            man[i].name = name;
        }
        // 参加人数分のビンゴカードを作成して表示
        for (int i = 0; i < count; i++) {
            man[i].bingocard();
            man[i].bingocardshow();
            System.out.println("");
        }

        // ガラポンの用意
        GameSystem gara = new GameSystem();
        gara.ballset();

        System.out.println("ゲームを開始します");
        System.out.println("エンターキーを押すたびにゲームが進行します");
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {
            gara.bingomahine();
            System.out.println("");
            for (int i = 0; i < count; i++) {
                man[i].hitcheck();
                man[i].bingocheck();
                man[i].bingocardshow();
                System.out.println("");
            }

            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }

            if(BingoCard.check == 1) {
                break;
            }
        }
    }
}