public class Tr51 {
    public static void main(String[] args) {
        DebtAccounts one = new DebtAccounts();
        System.out.println("口座を開設します。\n名前を入力して下さい。");
        String name = PConsole.inputString();
        one.BankAccounts(name, 1000);
        one.in();
        one.display();
        one.out();
        one.display();
    }
}