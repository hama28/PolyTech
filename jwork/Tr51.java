public class Tr51 {
    public static void main(String[] args) {
        DebtAccounts one = new DebtAccounts();
        System.out.println("�������J�݂��܂��B\n���O����͂��ĉ������B");
        String name = PConsole.inputString();
        one.BankAccounts(name, 1000);
        one.in();
        one.display();
        one.out();
        one.display();
    }
}