public class Tr32 {
    public static int seiseki(int[] array) {
        int ans = array[0] + array[1] + array[2];
        return ans;

    }
    public static void main(String[] args) {
        System.out.print("����̓_����");
        int k = PConsole.inputIntNum();
        System.out.print("�p��̓_����");
        int e = PConsole.inputIntNum();
        System.out.print("���w�̓_����");
        int s = PConsole.inputIntNum();

        int[] array = {k, e, s};
        int ans = seiseki(array);

        System.out.println("���v��" + ans + "�_�ł�");
    }
}