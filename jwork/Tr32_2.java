public class Tr32_2 {
    public static int seiseki(int[] array) {
        int ans = array[0] + array[1] + array[2];
        return ans;
    }

    public static double heikin(int[] array) {
        double ave = seiseki(array) / array.length;
        return ave;
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
        double ave = heikin(array);

        System.out.println("���v��" + ans + "�_�ł�");
        System.out.println("���ς�" + ave + "�_�ł�");
    }
}