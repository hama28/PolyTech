public class Tr06 {
    public static void main(String[] args) {
        int time;
        System.out.println("好きな秒数を入力して下さい。○時間○分○秒に変換します。）");
        time = PConsole.inputIntNum();
        int h = time / 3600;
        int m = (time - h * 3600) / 60;
        int s = time - (h * 3600) - (m * 60);
        
        System.out.println(h + "時間" + m + "分" + s + "秒");
    }
}