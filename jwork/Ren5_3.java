public class Ren5_3 {
    public static void main(String[] args) {
        System.out.println("メールアドレスを入力");
        String addres = PConsole.inputString();
        System.out.println("件名を入力");
        String title = PConsole.inputString();
        System.out.println("本文を入力");
        String text = PConsole.inputString();
        email(title, addres, text);
    }

    public static void email(String title, String addres, String text) {
        System.out.println(addres + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }
}