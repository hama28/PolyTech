public class Tr06 {
    public static void main(String[] args) {
        int time;
        System.out.println("�D���ȕb������͂��ĉ������B�����ԁ������b�ɕϊ����܂��B�j");
        time = PConsole.inputIntNum();
        int h = time / 3600;
        int m = (time - h * 3600) / 60;
        int s = time - (h * 3600) - (m * 60);
        
        System.out.println(h + "����" + m + "��" + s + "�b");
    }
}