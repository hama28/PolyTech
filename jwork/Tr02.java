public class Tr02 {
    public static void main(String[] args) {
        int time;
        System.out.println("４〜２２の数値を入力して下さい");
        time = PConsole.inputIntNum();
        if (time < 4 || time >22) {
            System.out.println("不正な値です");
        } else if (time < 10) {
            System.out.println("おはよう");
        } else if (time >= 19) {
            System.out.println("こんばんは");
        } else {
            System.out.println("こんにちは");
        }
    }
}