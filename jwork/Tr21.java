public class Tr21 {
    public static void main(String[] args) {
        int[] array = {
            678,42,671,219,211,710,832,6,740,316,
            11,768,712,294,4,124,692,564,842,756,
            493,345,791,174,862,870,854,679,545,612,
            256,249,271,871,212,400,251,312,229,529,
            74,560,378,781,624,111,498,384,342,917,
            728,943,807,839,126,910,959,172,514,869,
            869,346,762,562,100,766,144,93,806,390,
            793,165,529,878,199,856,445,306,266,456,
            737,158,115,447,923,917,254,739,339,587,
            369,376,777,76,709,645,238,143,96,23
        };

        System.out.println("小さい順（重複あり）");
        for (int n = 1; n <= 1000; n++) {
            for (int i = 0; i < 100; i++) {
                if (n == array[i]) {
                    System.out.print(array[i]);
                    System.out.print(",");
                }
            }    
        }
        System.out.println("");

        System.out.println("小さい順（重複なし）");
        int max = 0;
        for (int n = 1; n <= 1000; n++) {
            for (int i = 0; i < 100; i++) {
                if (n == array[i] && n != max) {
                    System.out.print(array[i]);
                    System.out.print(",");
                    max = n;
                }
            }
        }
        System.out.println("");

        System.out.println("大きい順（重複なし）");
        int min = 1001;
        for (int n = 1000; n >= 1; n--) {
            for (int i = 0; i < 100; i++) {
                if (n == array[i] && n != min) {
                    System.out.print(array[i]);
                    System.out.print(",");
                    min = n;
                }
            }
        }
    }
}