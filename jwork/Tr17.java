public class Tr17 {
    public static void main(String[] args) {
        int[] array = {678,42,671,219,211,710,832,6,740,316,
                       11,768,712,294,4,124,692,564,842,756,
                       493,345,791,174,862,870,854,679,545,612,
                       256,249,271,871,212,400,251,312,229,529,
                       74,560,378,781,624,111,498,384,342,917};
        int max = array[0];
        int min = array[1];

        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}