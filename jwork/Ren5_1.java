public class Ren5_1 {
    public static void main(String[] args) {
        introduceOneself();
    }

    public static void introduceOneself() {
        System.out.print("���O��");
        String name = PConsole.inputString();
        System.out.print("�N���");
        int age = PConsole.inputIntNum();
        System.out.print("�g����");
        double height = PConsole.inputIntNum();
        System.out.print("���x��");
        String eto = PConsole.inputString();

        System.out.println("���O�F" + name + "�@�N��F" + age);
        System.out.println("�g���F" + height + "�@���x�F" + eto);
    }
}