public class BankAccounts {
    String name;
    static int balance;
    int number;

    // ���O�ƍŏ��̗a���z��ݒ肵�ăC���X�^���X�쐬
    public void BankAccounts(String name, int balance) {
        this.name = name;
        this.balance = balance;
        // �����ԍ��͎����Ń����_���Ɋ���U��
        this.number = (int)(Math.random() * 1000);
        System.out.println("�����ԍ��F" + number + " ���`�F" + name + " �c���F" + balance);
    }

    // �a��
    public static void in() {
        System.out.print("�����z��");
        int num = PConsole.inputIntNum();
        System.out.print("�����z�F");
        System.out.println(num);
        balance = balance + num;
    }

    // ���o
    public static void out() {
        System.out.print("���o�z��");
        int num = PConsole.inputIntNum();
        System.out.print("���o�z�F");
        System.out.println(num);

        // �c��������Ă邩�`�F�b�N
        if (balance < num) {
            System.out.println("�c���s���ł�");
        } else {
            balance = balance - num;
        }
    }

    // �c���\��
    public static void display() {
        System.out.println("----------");
        System.out.println("�c���F" + balance);
        System.out.println("----------");
    }
}