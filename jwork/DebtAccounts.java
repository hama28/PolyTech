public class DebtAccounts extends BankAccounts {
    static int loan;

    // 引出
    public static void out() {
        System.out.print("引出額を");
        int num = PConsole.inputIntNum();
        System.out.print("引出額：");
        System.out.println(num);

        // 残高不足なら借入する
        if (balance < num) {
            loan = num;
            System.out.println("残高不足のため、" + loan + "円を借入ました");
        } else {
            balance = balance - num;
        }
    }

     // 残高表示
    public static void display() {
        System.out.println("----------");
        System.out.println("残高：" + balance);
        if (loan != 0) {
            System.out.println("借入：" + loan);
        }
        System.out.println("----------");
    }
}