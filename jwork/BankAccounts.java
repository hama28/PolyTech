public class BankAccounts {
    String name;
    static int balance;
    int number;

    // 名前と最初の預入額を設定してインスタンス作成
    public void BankAccounts(String name, int balance) {
        this.name = name;
        this.balance = balance;
        // 口座番号は自動でランダムに割り振る
        this.number = (int)(Math.random() * 1000);
        System.out.println("口座番号：" + number + " 名義：" + name + " 残高：" + balance);
    }

    // 預入
    public static void in() {
        System.out.print("入金額を");
        int num = PConsole.inputIntNum();
        System.out.print("入金額：");
        System.out.println(num);
        balance = balance + num;
    }

    // 引出
    public static void out() {
        System.out.print("引出額を");
        int num = PConsole.inputIntNum();
        System.out.print("引出額：");
        System.out.println(num);

        // 残高が足りてるかチェック
        if (balance < num) {
            System.out.println("残高不足です");
        } else {
            balance = balance - num;
        }
    }

    // 残高表示
    public static void display() {
        System.out.println("----------");
        System.out.println("残高：" + balance);
        System.out.println("----------");
    }
}