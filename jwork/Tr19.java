public class Tr19 {
    public static void main(String[] args) {
        System.out.print("個数を入力して下さい。");
        int count = PConsole.inputIntNum();
        System.out.print("価格を入力して下さい。");
        int price = PConsole.inputIntNum();

        if (count >= 100 || price >= 50000) {
            System.out.println(count * price * 0.9);
        } else {
            System.out.println(count * price);
        }
    }
}