public class Tr13 {
    public static void main(String[] args) {
        int[] array = {25, 48, 6, 31, 83, 1, 97, 64, 75, 123};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            if (v > max) {
                max = v;
            }
        }

        System.out.println(max);
    }
}