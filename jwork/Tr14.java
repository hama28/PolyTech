public class Tr14 {
    public static void main(String[] args) {
        int[] array = {2, 8, 36, 30, 42, 9, 77, 46, 85, 13};
        
        for (int i = 0; i < 9; i++) {
            System.out.print(array[i] + array[i+1]);
            System.out.print(", ");
        }
    }
}