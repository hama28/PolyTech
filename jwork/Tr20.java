import java.util.Arrays;

public class Tr20 {
    public static void main(String[] args) {
        int[][] seiseki; 
        seiseki = new int[3][10];

        System.out.println("����̓_������͂��ĉ������B");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + "�l�ڂ̓_�� ");
            seiseki[0][i] = PConsole.inputIntNum();
        }
        System.out.println(" ");

        System.out.println("�p��̓_������͂��ĉ������B");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + "�l�ڂ̓_�� ");
            seiseki[1][i] = PConsole.inputIntNum();
        }
        System.out.println(" ");

        System.out.println("���w�̓_������͂��ĉ������B");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + "�l�ڂ̓_�� ");
            seiseki[2][i] = PConsole.inputIntNum();
        }
        System.out.println(" ");

        int kokugo_sum = Arrays.stream(seiseki[0]).sum();
        int kokugo_ave = kokugo_sum / seiseki[0].length;
        int eigo_sum = Arrays.stream(seiseki[1]).sum();
        int eigo_ave = eigo_sum / seiseki[1].length;
        int sugaku_sum = Arrays.stream(seiseki[2]).sum();
        int sugaku_ave = sugaku_sum / seiseki[2].length;

        System.out.println("����̍��v�_�F" + kokugo_sum);
        System.out.println("����̕��ϓ_�F" + kokugo_ave);
        System.out.println("�p��̍��v�_�F" + eigo_sum);
        System.out.println("�p��̕��ϓ_�F" + eigo_ave);
        System.out.println("���w�̍��v�_�F" + sugaku_sum);
        System.out.println("���w�̕��ϓ_�F" + sugaku_ave);
    }
}