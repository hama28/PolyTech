public class Tr15 {
    public static void main(String[] args) {
        int year;
        System.out.println("�������͂��ĉ������B�[�N���ǂ������肵�܂��B�j");
        year = PConsole.inputIntNum();

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("�[�N");
        } else if (year % 4 == 0 && year % 100 == 0) {
            System.out.println("���N");
        } else if (year % 4 == 0) {
            System.out.println("�[�N");
        } else {
            System.out.println("���N");
        }
    }
}