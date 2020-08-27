import java.util.Arrays;

public class Tr20 {
    public static void main(String[] args) {
        int[][] seiseki; 
        seiseki = new int[3][10];

        System.out.println("国語の点数を入力して下さい。");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + "人目の点数 ");
            seiseki[0][i] = PConsole.inputIntNum();
        }
        System.out.println(" ");

        System.out.println("英語の点数を入力して下さい。");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + "人目の点数 ");
            seiseki[1][i] = PConsole.inputIntNum();
        }
        System.out.println(" ");

        System.out.println("数学の点数を入力して下さい。");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + "人目の点数 ");
            seiseki[2][i] = PConsole.inputIntNum();
        }
        System.out.println(" ");

        int kokugo_sum = Arrays.stream(seiseki[0]).sum();
        int kokugo_ave = kokugo_sum / seiseki[0].length;
        int eigo_sum = Arrays.stream(seiseki[1]).sum();
        int eigo_ave = eigo_sum / seiseki[1].length;
        int sugaku_sum = Arrays.stream(seiseki[2]).sum();
        int sugaku_ave = sugaku_sum / seiseki[2].length;

        System.out.println("国語の合計点：" + kokugo_sum);
        System.out.println("国語の平均点：" + kokugo_ave);
        System.out.println("英語の合計点：" + eigo_sum);
        System.out.println("英語の平均点：" + eigo_ave);
        System.out.println("数学の合計点：" + sugaku_sum);
        System.out.println("数学の平均点：" + sugaku_ave);
    }
}