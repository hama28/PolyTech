public class Tr02 {
    public static void main(String[] args) {
        int time;
        System.out.println("�S�`�Q�Q�̐��l����͂��ĉ�����");
        time = PConsole.inputIntNum();
        if (time < 4 || time >22) {
            System.out.println("�s���Ȓl�ł�");
        } else if (time < 10) {
            System.out.println("���͂悤");
        } else if (time >= 19) {
            System.out.println("����΂��");
        } else {
            System.out.println("����ɂ���");
        }
    }
}