public class Tr31 {
    public static int seiseki(int kokugo, int eigo, int sugaku) {
        int goukei = kokugo + eigo + sugaku;
        return goukei;
    }
    public static void main(String[] args) {
        System.out.print("����̓_����");
        int k = PConsole.inputIntNum();
        System.out.print("�p��̓_����");
        int e = PConsole.inputIntNum();
        System.out.print("���w�̓_����");
        int s = PConsole.inputIntNum();
        
        int goukei = seiseki(k, e, s);
        System.out.print("���v��" + goukei + "�_�ł�");
    }
}