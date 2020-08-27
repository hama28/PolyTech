public class Tr15 {
    public static void main(String[] args) {
        int year;
        System.out.println("西暦を入力して下さい。閏年かどうか判定します。）");
        year = PConsole.inputIntNum();

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("閏年");
        } else if (year % 4 == 0 && year % 100 == 0) {
            System.out.println("平年");
        } else if (year % 4 == 0) {
            System.out.println("閏年");
        } else {
            System.out.println("平年");
        }
    }
}