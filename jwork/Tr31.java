public class Tr31 {
    public static int seiseki(int kokugo, int eigo, int sugaku) {
        int goukei = kokugo + eigo + sugaku;
        return goukei;
    }
    public static void main(String[] args) {
        System.out.print("国語の点数を");
        int k = PConsole.inputIntNum();
        System.out.print("英語の点数を");
        int e = PConsole.inputIntNum();
        System.out.print("数学の点数を");
        int s = PConsole.inputIntNum();
        
        int goukei = seiseki(k, e, s);
        System.out.print("合計で" + goukei + "点です");
    }
}