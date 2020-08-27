public class Tr01 {
    public static void main(String[] args) {
        int kokugo;
        int eigo;
        int sugaku;
        int sum;
        int ave;

        kokugo = PConsole.inputIntNum();
        eigo = PConsole.inputIntNum();
        sugaku = PConsole.inputIntNum();
        
        sum = kokugo;
        sum += eigo;
        sum += sugaku; 
        ave = sum / 3;

        System.out.println("合計点は" + sum + "点です。");
        System.out.println("平均点は" + ave + "点です。");
    }
}