public class Ren5_3 {
    public static void main(String[] args) {
        System.out.println("���[���A�h���X�����");
        String addres = PConsole.inputString();
        System.out.println("���������");
        String title = PConsole.inputString();
        System.out.println("�{�������");
        String text = PConsole.inputString();
        email(title, addres, text);
    }

    public static void email(String title, String addres, String text) {
        System.out.println(addres + "�ɁA�ȉ��̃��[���𑗐M���܂���");
        System.out.println("�����F" + title);
        System.out.println("�{���F" + text);
    }
}