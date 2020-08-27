public class Tr03 {
    public static void main(String[] args) {
        int num_1;
        int num_2;
        int count;

        num_1 = PConsole.inputIntNum();
        num_2 = PConsole.inputIntNum();
        count = 1;

        while (count <= num_2) {
            System.out.println(num_1 * count);
            count++;
        }
    }
}