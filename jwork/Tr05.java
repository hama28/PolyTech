import java.util.Arrays;

public class Tr05 {
    public static void main(String[] args) {
        int[] array = {74, 80, 65, 34, 91};

        int sum = Arrays.stream(array).sum();
        int ave = sum / array.length;

        System.out.println(sum);
        System.out.println(ave);
    }
}