public class Tr09 {
    public static void main(String[] args) {
        int num_1 = PConsole.inputIntNum();
        int num_2 = PConsole.inputIntNum();

        if (Math.abs(num_1) > Math.abs(num_2)) {
            System.out.println(num_1);
        } else {
            System.out.println(num_2);
        }
    }
}