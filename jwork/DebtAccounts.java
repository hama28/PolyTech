public class DebtAccounts extends BankAccounts {
    static int loan;

    // ���o
    public static void out() {
        System.out.print("���o�z��");
        int num = PConsole.inputIntNum();
        System.out.print("���o�z�F");
        System.out.println(num);

        // �c���s���Ȃ�ؓ�����
        if (balance < num) {
            loan = num;
            System.out.println("�c���s���̂��߁A" + loan + "�~���ؓ��܂���");
        } else {
            balance = balance - num;
        }
    }

     // �c���\��
    public static void display() {
        System.out.println("----------");
        System.out.println("�c���F" + balance);
        if (loan != 0) {
            System.out.println("�ؓ��F" + loan);
        }
        System.out.println("----------");
    }
}