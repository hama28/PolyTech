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
        System.out.print("国語の点数を");
        int k = PConsole.inputIntNum();
        System.out.print("英語の点数を");
        int e = PConsole.inputIntNum();
        System.out.print("数学の点数を");
        int s = PConsole.inputIntNum();

        int[] array = {k, e, s};
        int ans = seiseki(array);
        double ave = heikin(array);

        System.out.println("合計は" + ans + "点です");
        System.out.println("平均は" + ave + "点です");
    }
}