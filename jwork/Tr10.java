public class Tr10 {
    public static void main(String[] args) {
        int num_1 = PConsole.inputIntNum();
        int num_2 = num_1;

        while (num_2 > 0) {
            if (num_1 % num_2 == 0) {
                System.out.println(num_2);
            }
            num_2--;
        }
    }
}