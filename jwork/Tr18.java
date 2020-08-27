public class Tr18 {
    public static void main(String[] args) {
        int[] array = {
            678,42,671,219,211,710,832,6,740,316,
            11,768,712,294,4,124,692,564,842,756,
            493,345,791,174,862,870,854,679,545,612,
            256,249,271,871,212,400,251,312,229,529,
            74,560,378,781,624,111,498,384,342,917
            };
        System.out.println("®”‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢");
        int num = PConsole.inputIntNum();

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= num) {
                System.out.print(array[i]);
                System.out.print(", ");
            }
        }

        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] < num) {
                System.out.print(array[i]);
                System.out.print(", ");
            }
        }
    }
}